public class Cajero extends Empleado{
    //Atributos de la subclase Empleado
    protected double monto;
    protected Cliente cliente;

    //Metodo constructor de Empleado
    public Cajero(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave, "Cajero");
    }

    //Metodo para mostrar el rol del cajero
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Cajero");
    }

    //Metodo para procesar un retiro del cliente, el valor del retiro se resta al saldo
    public void procesarRetiro(Cliente cliente, double monto){
        cliente.retirarMonto(monto);
    }

    //Metodo para porcesar un deposito
    public void procesarDeposito(Cliente cliente, double monto)
    {
        cliente.depositarMonto(monto);
    }
}
