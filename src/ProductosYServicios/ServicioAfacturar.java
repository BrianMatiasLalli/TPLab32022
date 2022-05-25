package ProductosYServicios;

public class ServicioAfacturar {
    private String descripcion;
    private double precio;

    public ServicioAfacturar(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nServicioAfacturar" + "\nDescripcion=" + descripcion +"\nPrecio=" + precio;
    }
}
