package estructuras_de_datos;

import Clases.pedido;

/**
 * Árbol Binario de Búsqueda (ABB) para gestionar pedidos.
 * Se ordena por el ID del pedido.
 */
public class arbolBinario<T extends pedido> {

    private NodoArbol<T> raiz;

    public arbolBinario() {
        raiz = null;
    }

    // ─────────────────────────────────────────────
    // INSERTAR
    // ─────────────────────────────────────────────
    public void insertar(T dato, int id) {
        raiz = insertarRec(raiz, dato, id);
    }

    private NodoArbol<T> insertarRec(NodoArbol<T> nodo, T dato, int id) {
        if (nodo == null) {
            return new NodoArbol<>(dato, id);
        }

        if (id < nodo.id) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, dato, id);
        } else if (id > nodo.id) {
            nodo.derecho = insertarRec(nodo.derecho, dato, id);
        }
        return nodo;
    }

    // ─────────────────────────────────────────────
    // BUSCAR
    // ─────────────────────────────────────────────
    public T buscar(int id) {
        NodoArbol<T> nodo = buscarRec(raiz, id);
        return (nodo != null) ? nodo.dato : null;
    }

    private NodoArbol<T> buscarRec(NodoArbol<T> nodo, int id) {
        if (nodo == null || nodo.id == id) {
            return nodo;
        }
        if (id < nodo.id) {
            return buscarRec(nodo.izquierdo, id);
        } else {
            return buscarRec(nodo.derecho, id);
        }
    }

    // ─────────────────────────────────────────────
    // ELIMINAR
    // ─────────────────────────────────────────────
    public void eliminar(int id) {
        raiz = eliminarRec(raiz, id);
    }

    private NodoArbol<T> eliminarRec(NodoArbol<T> nodo, int id) {
        if (nodo == null) {
            return null;
        }

        if (id < nodo.id) {
            nodo.izquierdo = eliminarRec(nodo.izquierdo, id);
        } else if (id > nodo.id) {
            nodo.derecho = eliminarRec(nodo.derecho, id);
        } else {
            // Nodo encontrado
            if (nodo.izquierdo == null)
                return nodo.derecho;
            else if (nodo.derecho == null)
                return nodo.izquierdo;

            // Caso con dos hijos: reemplazar con el sucesor
            NodoArbol<T> sucesor = encontrarMinimo(nodo.derecho);
            nodo.id = sucesor.id;
            nodo.dato = sucesor.dato;
            nodo.derecho = eliminarRec(nodo.derecho, sucesor.id);
        }
        return nodo;
    }

    private NodoArbol<T> encontrarMinimo(NodoArbol<T> nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo;
    }

    // ─────────────────────────────────────────────
    // MOSTRAR INORDEN
    // ─────────────────────────────────────────────
    public void mostrarInOrden() {
        mostrarInOrdenRec(raiz);
    }

    private void mostrarInOrdenRec(NodoArbol<T> nodo) {
        if (nodo != null) {
            mostrarInOrdenRec(nodo.izquierdo);
            System.out.println("ID: " + nodo.id + " → " + nodo.dato);
            mostrarInOrdenRec(nodo.derecho);
        }
    }

    // ─────────────────────────────────────────────
    // CONTAR NODOS
    // ─────────────────────────────────────────────
    public int obtenerCantidad() {
        return contarNodos(raiz);
    }

    private int contarNodos(NodoArbol<T> nodo) {
        if (nodo == null)
            return 0;
        return 1 + contarNodos(nodo.izquierdo) + contarNodos(nodo.derecho);
    }

    // ─────────────────────────────────────────────
    // GETTER DE RAÍZ (por si necesitas recorrer desde fuera)
    // ─────────────────────────────────────────────
    public NodoArbol<T> getRaiz() {
        return raiz;
    }
}

