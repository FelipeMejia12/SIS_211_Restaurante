package estructuras_de_datos;

/**
 * Implementación genérica de una cola enlazada.
 * Compatible con cualquier tipo de dato (por ejemplo, objetos "pedido").
 */
public class cola<T> {

    private Nodo<T> frente; 
    private Nodo<T> finalCola;
    private int size;

    public cola() {
        this.frente = null;
        this.finalCola = null;
        this.size = 0;
    }

    /**
     * ENQUEUE: Añade un elemento al final de la cola.
     */
    public void enqueue(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);

        if (estaVacia()) {
            frente = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
        }
        finalCola = nuevoNodo;
        size++;
    }

    /**
     * DEQUEUE: Extrae y elimina el elemento del frente.
     */
    public T desencolar() {
        if (estaVacia()) {
            System.out.println("⚠️ La cola está vacía.");
            return null;
        }

        T datoExtraido = frente.dato; 
        frente = frente.siguiente;

        if (frente == null) {
            finalCola = null;
        }
        size--;
        return datoExtraido;
    }

    /**
     * PEEK: Muestra el elemento del frente.
     */
    public T verFrente() {
        return estaVacia() ? null : frente.dato;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public int obtenersize() {
        return size;
    }

    /**
     * Muestra todos los elementos de la cola.
     * Si T es "pedido", muestra sus datos principales.
     */
    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("⚠️ La cola está vacía.");
            return;
        }

        Nodo<T> actual = frente;
        System.out.println("📋 Cola (orden de llegada):");
        while (actual != null) {
            T dato = actual.dato;
            // Si el elemento es un pedido, imprime sus detalles
            if (dato instanceof Clases.pedido) {
                Clases.pedido p = (Clases.pedido) dato;
                System.out.println("  → Pedido #" + p.getId() +
                                   " | Mesa: " + p.getNum_mesa() +
                                   " | Usuario: " + p.getUsuario() +
                                   " | Total: " + p.getTotal());
            } else {
                System.out.println("  → " + dato);
            }
            actual = actual.siguiente;
        }
    }

	public Nodo<T> getFrente() {
    return frente;
}


    /**
     * Limpia toda la cola.
     */
    public void vaciar() {
        frente = null;
        finalCola = null;
        size = 0;
    }
}
