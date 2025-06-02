public class BalconServicios extends Empleado {
    //Constructor de BalconServicios
    public BalconServicios(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave, "Balcon de servicios");
    }

    //Metodo para mostrar el rol del empleado 'Balcon de servicios'
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Empleado de Balcon de Servicios");
    }

    //Metodo para registrar un nuevo cliente
    public Cliente registrarNuevoCliente(String nombre, String cedula, String direccion, String telefono, String tipo_cuenta){
        //Se crea un nuevo objeto cliente con los datos proporcionados
        return new Cliente(nombre, cedula, direccion, telefono, tipo_cuenta);
    }

    //Metodo para actualizar los datos de un cliente
    public void actualizarDatosCliente(Cliente cliente){
        modificarDatosClientes(cliente);
    }
}
