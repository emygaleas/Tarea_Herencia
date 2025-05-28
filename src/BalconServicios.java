public class BalconServicios extends Empleado {
    public BalconServicios(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave, "Balcon de servicios");
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Empleado de Balcon de Servicios");
    }

    public Cliente registrarNuevoCliente(String nombre, String cedula, String direccion, String telefono, String tipo_cuenta){
        return new Cliente(nombre, cedula, direccion, telefono, tipo_cuenta);
    }

    public void actualizarDatosCliente(Cliente cliente){
        modificarDatosClientes(cliente);
    }
}
