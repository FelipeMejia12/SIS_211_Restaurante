package Clases;

import estructuras_de_datos.Nodo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class login extends BSTStringNodeBase {
	private int id;
    private String nombre;
    private String correo;
    private String pass;
    private String rol;
    
    //para la gestión con archivos de texto
    private static Nodo<login> raizUsuarios; 
    private static int ultimoId = 0; 
    private static final String ARCHIVO_USUARIOS = "usuarios.txt";

    public login() {
    	if (raizUsuarios == null) {
            cargarUsuariosDesdeArchivo(ARCHIVO_USUARIOS);
       }
    }

    public login(int id, String nombre, String correo, String pass, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.pass = pass;
        this.rol = rol;
    }

    // ------------------------------------
    // IMPLEMENTACIÓN DE HERENCIA Y CONTRATO
    // ------------------------------------
    
    @Override
    public String getCompareKey() {
        // Define la clave de ordenamiento del BST: el correo.
        return this.correo;
    }
    
 // ------------------------------------
    // PERSISTENCIA Y CARGA DE ARCHIVOS
    // ------------------------------------
    
    public static void cargarUsuariosDesdeArchivo(String nombreArchivo) {
        raizUsuarios = null;
        ultimoId = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    try {
                        int id = Integer.parseInt(partes[0].trim());
                        ultimoId = Math.max(ultimoId, id);
                        
                        login nuevoUsuario = new login(
                            id, partes[1].trim(), partes[2].trim(), partes[3].trim(), partes[4].trim()  
                        );
                        // Usa el método estático para construir el BST
                        insertarEstatico(nuevoUsuario); 
                    } catch (NumberFormatException e) {
                        System.err.println("Error de formato en línea de usuario: " + linea);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de usuarios no encontrado. Se creará admin por defecto.");
            crearAdministradorInicial();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void crearAdministradorInicial() {
        login admin = new login(1, "Administrador", "admin@rest.com", "1234", "Administrador");
        insertarEstatico(admin);
        ultimoId = 1;
        guardarUsuariosAArchivo(ARCHIVO_USUARIOS);
    }
    
    public static void guardarUsuariosAArchivo(String nombreArchivo) {
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            List<login> listaUsuarios = obtenerTodosLosUsuariosEstatico(raizUsuarios);
            for (login u : listaUsuarios) {
                String linea = String.format("%d,%s,%s,%s,%s", 
                    u.getId(), u.getNombre(), u.getCorreo(), u.getPass(), u.getRol());
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
 // ------------------------------------
    // MÉTODOS DE GESTIÓN (Llamados desde UI)
    // ------------------------------------
    
    /**
     * Válida las credenciales. Llamado desde User_Interface.Login.java
     */
    public login validarCredenciales(String correo, String pass) {
        login encontrado = buscarEstatico(correo); // Búsqueda en BST (recursiva)
        if (encontrado != null && encontrado.getPass().equals(pass)) {
            return encontrado; 
        } else {
            return null; 
        }
    }
    
    /**
     * Registra un nuevo usuario. Llamado desde User_Interface.Sistema.java
     */
    public boolean registrarUsuario(login nuevoUsuario) {
        if (buscarEstatico(nuevoUsuario.getCorreo()) != null) {
            return false; // El correo ya existe
        }
        renumerarIDs();
        nuevoUsuario.setId(++ultimoId); // Asignar el siguiente ID
        insertarEstatico(nuevoUsuario);
        guardarUsuariosAArchivo(ARCHIVO_USUARIOS); // Persistir los cambios
        return true;
    }
    
 // Método NUEVO para eliminar usuarios desde la UI
    public boolean eliminarUsuario(String correo) {
        if (buscarEstatico(correo) == null) {
            return false; // No existe
        }
        raizUsuarios = eliminarRecursivoEstatico(raizUsuarios, correo);
        renumerarIDs();
        guardarUsuariosAArchivo(ARCHIVO_USUARIOS);
        return true;
    }
    
    /**
     * Devuelve una lista de todos los usuarios. Llamado desde User_Interface.Sistema.java
     */
    public static List<login> ListarUsuarios() {
        return obtenerTodosLosUsuariosEstatico(raizUsuarios);
    }


    // ------------------------------------
    // MÉTODOS DEL BST (Implementación de Recursividad)
    // ------------------------------------

    // Búsqueda en el BST (Recursiva)
    private static login buscarEstatico(String correo) {
        return buscarRecursivoEstatico(raizUsuarios, correo);
    }
    
    private static login buscarRecursivoEstatico(Nodo<login> actual, String correo) {
        if (actual == null) return null;
        
        // Compara el correo buscado con la clave del nodo actual
        int comparacion = correo.compareTo(actual.dato.getCompareKey());
        
        if (comparacion == 0) return actual.dato;
        
        // Decisión recursiva: si el correo buscado es menor (viene antes en orden alfabético)
        return comparacion < 0 
               ? buscarRecursivoEstatico(actual.izquierda, correo)
               : buscarRecursivoEstatico(actual.derecha, correo);
    }

    // Inserción en el BST (Recursiva)
    private static void insertarEstatico(login nuevoUsuario) {
        raizUsuarios = insertarRecursivoEstatico(raizUsuarios, nuevoUsuario);
    }
    
    private static Nodo<login> insertarRecursivoEstatico(Nodo<login> actual, login nuevoUsuario) {
        if (actual == null) {
            return new Nodo<>(nuevoUsuario);
        }

        // Compara la clave del nuevo usuario con la clave del nodo actual
        int comparacion = nuevoUsuario.getCompareKey().compareTo(actual.dato.getCompareKey());
        
        if (comparacion < 0) {
            actual.izquierda = insertarRecursivoEstatico(actual.izquierda, nuevoUsuario);
        } else if (comparacion > 0) {
            actual.derecha = insertarRecursivoEstatico(actual.derecha, nuevoUsuario);
        }
        // Si comparacion == 0, el correo ya existe, no se hace nada.

        return actual;
    }
    
 // ELIMINAR USUARIO (Lógica BST Completa)
    private static Nodo<login> eliminarRecursivoEstatico(Nodo<login> actual, String correo) {
        if (actual == null) return null;

        int comparacion = correo.compareTo(actual.dato.getCompareKey());

        if (comparacion < 0) {
            actual.izquierda = eliminarRecursivoEstatico(actual.izquierda, correo);
        } else if (comparacion > 0) {
            actual.derecha = eliminarRecursivoEstatico(actual.derecha, correo);
        } else {
            // Nodo encontrado
            // Caso 1 y 2: Sin hijos o un solo hijo
            if (actual.izquierda == null) return actual.derecha;
            if (actual.derecha == null) return actual.izquierda;

            // Caso 3: Dos hijos (Buscar sucesor)
            login sucesor = encontrarMinimo(actual.derecha);
            actual.dato = sucesor; // Reemplazar datos
            // Eliminar el sucesor de la rama derecha
            actual.derecha = eliminarRecursivoEstatico(actual.derecha, sucesor.getCompareKey());
        }
        return actual;
    }

    private static login encontrarMinimo(Nodo<login> nodo) {
        login min = nodo.dato;
        while (nodo.izquierda != null) {
            min = nodo.izquierda.dato;
            nodo = nodo.izquierda;
        }
        return min;
    }
    
    // Recorrido In-Order para obtener la lista de usuarios (Recursiva)
    private static List<login> obtenerTodosLosUsuariosEstatico(Nodo<login> nodo) {
        List<login> usuarios = new ArrayList<>();
        if (nodo != null) {
            usuarios.addAll(obtenerTodosLosUsuariosEstatico(nodo.izquierda));
            usuarios.add(nodo.dato);
            usuarios.addAll(obtenerTodosLosUsuariosEstatico(nodo.derecha));
        }
        return usuarios;
    }
    
    private void renumerarIDs() {
        
        List<login> todos = obtenerTodosLosUsuariosEstatico(raizUsuarios);
        int nuevoId = 1;
        for (login u : todos) {
            u.setId(nuevoId++);
            ultimoId = nuevoId - 1;
        }
    }
    
    //Getters y Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
