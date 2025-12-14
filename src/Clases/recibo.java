package Clases;

public class recibo {
	private String f_emision;
	private double monto_total;
	private int id_pedido;
	private int id_itemPedido;
	public recibo() {
		// TODO Auto-generated constructor stub
	}
	public recibo(String f_emision, double monto_total, int id_pedido, int id_itemPedido) {
		this.f_emision = f_emision;
		this.monto_total = monto_total;
		this.id_pedido = id_pedido;
		this.id_itemPedido = id_itemPedido;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public int getId_itemPedido() {
		return id_itemPedido;
	}
	public void setId_itemPedido(int id_itemPedido) {
		this.id_itemPedido = id_itemPedido;
	}
	public String getF_emision() {
		return f_emision;
	}
	public void setF_emision(String f_emision) {
		this.f_emision = f_emision;
	}
	public double getMonto_total() {
		return monto_total;
	}
	public void setMonto_total(double monto_total) {
		this.monto_total = monto_total;
	}
}
