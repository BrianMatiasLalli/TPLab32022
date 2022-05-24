package clases;

public class Vendedor extends Persona{
    private String id;//puede ser las iniciales de nombre y apellido
    private String contrasenia;//alfanumerica;

    public Vendedor(String nombre, String apellido, String dni, String telefono, String direccion, String correo, String id, String contrasenia) {
        super(nombre,apellido,dni,telefono,direccion,correo);
        this.id = id;
        this.contrasenia = contrasenia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "\nVendedor=" + "\nId= " + id + super.toString();
    }
}
