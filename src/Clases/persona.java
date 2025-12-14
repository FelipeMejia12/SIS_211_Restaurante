package Clases;

public class persona {
	private String nombre;
	private String apellido;
	private int celular;
	public persona() {
		// TODO Auto-generated constructor stub
	}
	public persona(String nombre, String apellido, int celular) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
}
