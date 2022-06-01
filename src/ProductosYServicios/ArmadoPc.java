package ProductosYServicios;

import clases.Cliente;

public class ArmadoPc extends Servicio{
    private Computadora aArmar;
    public ArmadoPc(String descripcion, Cliente cliente,Computadora aArmar,double precio) {
        super(descripcion, cliente,precio);
        this.aArmar = aArmar;
    }

    public Computadora getaArmar() {
        return aArmar;
    }

    @Override
    public String toString() {
        return "\nArmadoPc" + "\nPc=" + aArmar + super.toString();
    }
}
