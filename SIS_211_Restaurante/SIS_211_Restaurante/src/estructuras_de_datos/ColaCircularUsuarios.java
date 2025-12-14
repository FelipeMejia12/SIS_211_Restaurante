package estructuras_de_datos;

import Clases.login;
import java.util.ArrayList;
import java.util.List;

/**
 * Cola Circular especializada en objetos login (usuarios).
 */
public class ColaCircularUsuarios {

    private NodoCircular<login> cabeza;
    private NodoCircular<login> cola;
    private int tamano;

    public ColaCircularUsuarios() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }

    public void insertar(login nuevoUsuario) {
        NodoCircular<login> nodo = new NodoCircular<>(nuevoUsuario);
        if (cabeza == null) {
            cabeza = nodo;
            cola = nodo;
            nodo.setSiguiente(cabeza);
        } else {
            nodo.setSiguiente(cabeza);
            cola.setSiguiente(nodo);
            cola = nodo;
        }
        tamano++;
    }

    public login buscarPorUsuario(String correo, String password) {
        if (cabeza == null) return null;
        NodoCircular<login> actual = cabeza;
        for (int i = 0; i < tamano; i++) {
            login u = actual.getDato();
            if (u != null && u.getCorreo() != null && u.getPass() != null) {
                if (u.getCorreo().equals(correo) && HashUtils.verifySha256(password, u.getPass())) {
                    return u;
                }
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public boolean existeCorreo(String correo) {
        if (cabeza == null) return false;
        NodoCircular<login> actual = cabeza;
        for (int i = 0; i < tamano; i++) {
            login u = actual.getDato();
            if (u != null && u.getCorreo() != null && u.getCorreo().equals(correo)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public login buscarPorCorreo(String correo) {
        if (cabeza == null) return null;
        NodoCircular<login> actual = cabeza;
        for (int i = 0; i < tamano; i++) {
            login u = actual.getDato();
            if (u != null && u.getCorreo() != null && u.getCorreo().equals(correo)) {
                return u;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public boolean eliminarPorCorreo(String correo) {
        if (cabeza == null || correo == null) return false;
        // if the head is the one to delete
        if (cabeza.getDato() != null && correo.equals(cabeza.getDato().getCorreo())) {
            if (tamano == 1) {
                cabeza = null;
                cola = null;
                tamano = 0;
                return true;
            } else {
                cabeza = cabeza.getSiguiente();
                cola.setSiguiente(cabeza);
                tamano--;
                return true;
            }
        }
        NodoCircular<login> prev = cabeza;
        NodoCircular<login> curr = cabeza.getSiguiente();
        for (int i = 1; i < tamano; i++) {
            if (curr.getDato() != null && correo.equals(curr.getDato().getCorreo())) {
                prev.setSiguiente(curr.getSiguiente());
                if (curr == cola) cola = prev;
                tamano--;
                return true;
            }
            prev = curr;
            curr = curr.getSiguiente();
        }
        return false;
    }

    public boolean actualizarUsuario(login actualizado) {
        if (cabeza == null || actualizado == null) return false;
        NodoCircular<login> actual = cabeza;
        for (int i = 0; i < tamano; i++) {
            login u = actual.getDato();
            if (u != null && u.getId() == actualizado.getId()) {
                actual.setDato(actualizado);
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public List<login> toList() {
        List<login> list = new ArrayList<>();
        if (cabeza == null) return list;
        NodoCircular<login> actual = cabeza;
        for (int i = 0; i < tamano; i++) {
            list.add(actual.getDato());
            actual = actual.getSiguiente();
        }
        return list;
    }

    public login siguiente() {
        if (cabeza == null) return null;
        cabeza = cabeza.getSiguiente();
        return cabeza.getDato();
    }

    public int getTamano() { return tamano; }
}
