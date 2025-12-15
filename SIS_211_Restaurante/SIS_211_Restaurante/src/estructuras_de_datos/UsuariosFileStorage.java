package estructuras_de_datos;

import Clases.login;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsuariosFileStorage {

    private final File dir;
    private final File file;

    public UsuariosFileStorage(String basePath) {
        this.dir = new File(basePath);
        // Prefer 'usuario.txt' but fall back to 'usuarios.txt' if present.
        File candidate1 = new File(dir, "usuario.txt");
        File candidate2 = new File(dir, "usuarios.txt");
        if (candidate1.exists()) {
            this.file = candidate1;
        } else if (candidate2.exists()) {
            this.file = candidate2;
        } else {
            // Default to 'usuario.txt' (will be created on write)
            this.file = candidate1;
        }
    }

    public List<login> readUsers() {
        List<login> users = new ArrayList<>();
        if (!file.exists()) return users;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                    // Format: id,nombre,correo,passwordHash,rol
                    String[] parts = line.split(",", -1);
                if (parts.length >= 5) {
                    try {
                        int id = Integer.parseInt(parts[0]);
                        String nombre = parts[1];
                        String correo = parts[2];
                        String passHash = parts[3];
                        String rol = parts[4];
                        login u = new login(id, nombre, correo, passHash, rol);
                        users.add(u);
                    } catch (NumberFormatException ex) {
                        // skip invalid lines
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public void appendUser(login u) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            // id,nombre,correo,passwordHash,rol
            String line = String.format("%d,%s,%s,%s,%s", u.getId(), u.getNombre(), u.getCorreo(), u.getPass(), u.getRol());
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
    }

    public void saveAll(List<login> users) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))) {
            for (login u : users) {
                String line = String.format("%d,%s,%s,%s,%s", u.getId(), u.getNombre(), u.getCorreo(), u.getPass(), u.getRol());
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
        }
    }
}
