package estructuras_de_datos;

import Clases.pedido;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que integra la cola y el árbol binario para gestionar los pedidos.
 * Permite agregar, atender, buscar y mostrar pedidos desde ambas estructuras.
 */
public class GestorPedidosEstructuras {

    private cola<pedido> colaPedidos;       // Cola de pedidos
    private arbolBinario<pedido> arbolPedidos; // Árbol binario de pedidos

    public GestorPedidosEstructuras() {
        colaPedidos = new cola<>();           // Inicializa cola
        arbolPedidos = new arbolBinario<>();  // Inicializa árbol
    }

    // ===========================================================
    // ➕ AGREGAR PEDIDO
    // ===========================================================
    public void agregarPedido(pedido p) {
        colaPedidos.enqueue(p);                // Encolar
        arbolPedidos.insertar(p, p.getId());   // Insertar en árbol por ID
        System.out.println("✅ Pedido agregado: #" + p.getId());
    }

    // ===========================================================
    // ❌ ATENDER (ELIMINAR) PEDIDO
    // ===========================================================
    public void atenderPedido() {
        pedido atendido = colaPedidos.desencolar(); // Saca el primero
        if (atendido != null) {
            arbolPedidos.eliminar(atendido.getId()); // Elimina del árbol
            System.out.println("🧾 Pedido atendido y eliminado del árbol: #" + atendido.getId());
        } else {
            System.out.println("⚠️ No hay pedidos en la cola.");
        }
    }

    // ===========================================================
    // 🔍 BUSCAR PEDIDO
    // ===========================================================
    public void buscarPedido(int id) {
        pedido encontrado = arbolPedidos.buscar(id);
        if (encontrado != null) {
            System.out.println("🔎 Pedido encontrado: " + encontrado.getUsuario() +
                               " | Mesa " + encontrado.getNum_mesa() +
                               " | Total " + encontrado.getTotal());
        } else {
            System.out.println("❌ No se encontró el pedido con ID " + id);
        }
    }

    // ===========================================================
    // 📋 MOSTRAR PEDIDOS (COLA + ÁRBOL)
    // ===========================================================
    public void mostrarPedidos() {
        System.out.println("\n=== PEDIDOS EN COLA (orden de llegada) ===");
        colaPedidos.mostrarCola();

        System.out.println("\n=== PEDIDOS EN ÁRBOL (ordenado por ID) ===");
        arbolPedidos.mostrarInOrden();
    }

    // ===========================================================
    // ⚙️ UTILIDADES
    // ===========================================================
    public boolean hayPedidos() {
        return !colaPedidos.estaVacia();
    }

    public void limpiarTodo() {
        colaPedidos.vaciar();
        System.out.println("🧹 Se vació la cola.");

        // No tenemos método limpiar en ArbolBinario, así que reseteamos la instancia
        arbolPedidos = new arbolBinario<>();
        System.out.println("🧹 Se reinició el árbol.");
    }

    // ===========================================================
    // 📦 OBTENER LISTA DE PEDIDOS EN COLA (para mostrar en tabla)
    // ===========================================================
    public List<pedido> obtenerPedidosEnCola() {
        List<pedido> lista = new ArrayList<>();
        Nodo<pedido> actual = colaPedidos.getFrente();
        while (actual != null) {
            lista.add(actual.dato);
            actual = actual.siguiente;
        }
        return lista;
    }

   // =========================
// 🔢 Generar ID único
// =========================
private int contadorId = 1;

public int generarIdPedido() {
    return contadorId++;
}

}
