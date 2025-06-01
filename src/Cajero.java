import java.util.ArrayList;

public class Cajero extends Empleado{
    protected double monto;
    protected Cliente cliente;

    public Cajero(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave, "Cajero");
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Cajero");
    }

    public void procesarRetiro(Cliente cliente, double monto){
        cliente.depositarMonto(monto);
    }

    public void procesarDeposito(Cliente cliente, double monto){
        cliente.retirarMonto(monto);
    }
}
