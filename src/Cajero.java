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
        if (cliente.getSaldo()<monto){
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Cantidad retirada: "+monto);
    }

    public void consultarSaldo(Cliente cliente){
        System.out.println("Su saldo actual es: "+cliente.getSaldo());
    }

    public void procesarDeposito(Cliente cliente, double monto){
        System.out.println("Cantidad depositada: "+monto);
    }
}
