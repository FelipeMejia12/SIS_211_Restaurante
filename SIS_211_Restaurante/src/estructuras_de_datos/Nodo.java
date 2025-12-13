package estructuras_de_datos;

public class Nodo<T> { 
    
    public T dato;
    public Nodo<T> siguiente; 
    public Nodo<T> izquierda; // Necesario para BST
    public Nodo<T> derecha;   // Necesario para BST
    
    public Nodo(T dato) {
       this.dato = dato;
       this.siguiente = null;
       this.izquierda = null;
       this.derecha = null;
    }
}