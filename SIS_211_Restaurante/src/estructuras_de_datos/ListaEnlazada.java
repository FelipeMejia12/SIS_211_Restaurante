package estructuras_de_datos;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaEnlazada<T> implements Iterable<T> {
    
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamanio;
    
    public ListaEnlazada() {
        this.cabeza = null;
        this.cola = null;
        this.tamanio = 0;
    }
    
    /**
     * Agrega un elemento al final de la lista
     */
    public void agregar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
        tamanio++;
    }
    
    /**
     * Agrega un elemento al inicio de la lista
     */
    public void agregarAlInicio(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }
        tamanio++;
    }
    
    /**
     * Elimina un elemento de la lista
     * @return true si se eliminó, false si no se encontró
     */
    public boolean eliminar(T elemento) {
        if (estaVacia()) {
            return false;
        }
        
        // Si el elemento está en la cabeza
        if (cabeza.dato.equals(elemento)) {
            cabeza = cabeza.siguiente;
            if (cabeza == null) {
                cola = null;
            }
            tamanio--;
            return true;
        }
        
        // Buscar en el resto de la lista
        Nodo<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(elemento)) {
                actual.siguiente = actual.siguiente.siguiente;
                if (actual.siguiente == null) {
                    cola = actual;
                }
                tamanio--;
                return true;
            }
            actual = actual.siguiente;
        }
        
        return false;
    }
    
    /**
     * Busca un elemento en la lista
     * @return el elemento si se encuentra, null si no
     */
    public T buscar(T elemento) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(elemento)) {
                return actual.dato;
            }
            actual = actual.siguiente;
        }
        return null;
    }
    
    /**
     * Obtiene un elemento por índice
     */
    public T obtener(int indice) {
        if (indice < 0 || indice >= tamanio) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
        
        Nodo<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }
    
    /**
     * Verifica si la lista contiene un elemento
     */
    public boolean contiene(T elemento) {
        return buscar(elemento) != null;
    }
    
    /**
     * Elimina todos los elementos de la lista
     */
    public void limpiar() {
        cabeza = null;
        cola = null;
        tamanio = 0;
    }
    
    /**
     * Verifica si la lista está vacía
     */
    public boolean estaVacia() {
        return cabeza == null;
    }
    
    /**
     * Obtiene el tamaño de la lista
     */
    public int getTamanio() {
        return tamanio;
    }
    
    /**
     * Obtiene el primer elemento
     */
    public T getPrimero() {
        if (estaVacia()) {
            return null;
        }
        return cabeza.dato;
    }
    
    /**
     * Obtiene el último elemento
     */
    public T getUltimo() {
        if (estaVacia()) {
            return null;
        }
        return cola.dato;
    }
    
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Nodo<T> actual = cabeza;
            
            @Override
            public boolean hasNext() {
                return actual != null;
            }
            
            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T dato = actual.dato;
                actual = actual.siguiente;
                return dato;
            }
        };
    }
    
    @Override
    public String toString() {
        if (estaVacia()) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> actual = cabeza;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) {
                sb.append(", ");
            }
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}
