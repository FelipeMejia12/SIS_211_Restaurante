package estructuras_de_datos;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class cola<T> implements Iterable<T> {

	private Nodo<T> frente; 
	private Nodo<T> finalCola;
	private int size;

	public cola() {
		this.frente = null;
		this.finalCola = null;
		this.size = 0;
	}
	
	 /**
	  * ENQUEUE: Añade un elemento al final de la cola
	  */
	 public void enqueue(T elemento) {
	     Nodo<T> nuevoNodo = new Nodo<>(elemento);
	     
	     if (estaVacia()) {
	         frente = nuevoNodo;
	     }
	     else {
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
	 * Compatibilidad: método esperado en el código existente.
	 */
	public int getSize() {
		return obtenersize();
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private Nodo<T> current = frente;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public T next() {
				if (current == null) throw new NoSuchElementException();
				T val = current.dato;
				current = current.siguiente;
				return val;
			}
		};
	}
}