package estructuras_de_datos;

public class Nodo<T> {
	T dato;
	Nodo<T> siguiente;
	
	public Nodo(T dato) {
	   this.dato = dato;
	   this.siguiente = null;
	}
}
