package estructuras_de_datos;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class cola<T> implements Iterable<T>{

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
	
	 public int getSize() {
	     return size;
	 }
	 
	 public Iterator<T> iterator() {
	     return new ColaIterator();
	 }
	 
	 private class ColaIterator implements Iterator<T> {
        
        // Puntero temporal que siempre comienza en el frente de la cola
        private Nodo<T> actual = frente; 

        /**
         * Verifica si hay más elementos para recorrer.
         */
        @Override
        public boolean hasNext() {
            return actual != null;
        }

        /**
         * Devuelve el elemento actual y avanza el puntero.
         */
        @Override
        public T next() {
            if (!hasNext()) {
                // Lanza excepción si se intenta llamar a next() cuando no hay más elementos
                throw new NoSuchElementException();
            }
            T dato = actual.dato;      // 1. Obtener el dato del nodo actual
            actual = actual.siguiente; // 2. Mover el puntero al siguiente nodo
            return dato;               // 3. Devolver el dato
        }
    }
}