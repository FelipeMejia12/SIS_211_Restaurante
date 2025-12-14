package Clases;

public class pedido {
    private int id;
    private int num_mesa;
    private String fecha;
    private double total;
    private String usuario;
    private String estado;

    public pedido() {
    }

    public pedido(int id, int num_mesa, String fecha, double total, String usuario, String estado) {
        this.id = id;
        this.num_mesa = num_mesa;
        this.fecha = fecha;
        this.total = total;
        this.usuario = usuario;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_mesa() {
        return num_mesa;
    }

    public void setNum_mesa(int num_mesa) {
        this.num_mesa = num_mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }   
}
