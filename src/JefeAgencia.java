public class JefeAgencia extends Empleado{
    public JefeAgencia(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave, "Jefe de Agencia");
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Jefe de Agencia");
    }

    public boolean condicion(double saldo){
        return saldo!=0;
    }

    public boolean aprobarPrestamo(Cliente cliente, double monto){
        if(condicion(cliente.getSaldo())){
            System.out.println("Prestamo de "+ monto+" aprobado");
            return true;
        }
        else {
            System.out.println("Prestamo de "+monto+" rechazado");
            return false;
        }
    }

    public void evaluarEmpleado(Empleado empleado, String evaluacion){
        System.out.println("Empleado: "+empleado+"\nDesempeño: "+ evaluacion);
    }

}