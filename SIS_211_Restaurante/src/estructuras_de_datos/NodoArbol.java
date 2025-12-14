package estructuras_de_datos;

/**
 * Nodo para árbol binario genérico.
 * Contiene un ID entero usado como clave de ordenamiento.
 */
public class NodoArbol<T> {
    public T dato;
    public int id;
    public NodoArbol<T> izquierdo;
    public NodoArbol<T> derecho;

    public NodoArbol(T dato, int id) {
        this.dato = dato;
        this.id = id;
        this.izquierdo = null;
        this.derecho = null;
    }
}
