package Clases;

/**
 * Clase base abstracta para todas las entidades que se almacenarán en un 
 * Árbol de Búsqueda Binaria (BST) ordenado por una clave de tipo String.
 * * Propósito: Obligar a las clases hijas (como login) a proporcionar 
 * la clave (correo) que el Gestor (la clase login extendida) usará para 
 * la comparación recursiva y el ordenamiento del árbol.
 */
public abstract class BSTStringNodeBase {
    
    /**
     * Define y retorna la clave única de tipo String que se usará para 
     * ordenar el BST (por ejemplo, el correo electrónico).
     * @return La clave de comparación.
     */
    public abstract String getCompareKey();
    
}