package estructuras_de_datos;

class Nodo<T> {
	T dato;
	Nodo<T> siguiente;
	
	public Nodo(T dato) {
	   this.dato = dato;
	   this.siguiente = null;
	}
}
