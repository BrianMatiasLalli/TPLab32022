package ProductosYServicios;

import clases.Cliente;

public class ArmadoPc extends Servicio{
    private Computadora aArmar;
    public ArmadoPc(String descripcion, Cliente cliente,Computadora aArmar) {
        super(descripcion, cliente);
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
