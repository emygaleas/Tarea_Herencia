public class JefeAgencia extends Empleado{
    //Constructor de la clase JefeAgencia
    public JefeAgencia(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave, "Jefe de Agencia");
    }

    //Metodo para mostrar el rol del jefe de agencia
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Jefe de Agencia");
    }

    //Condicion basada en el saldo
    public boolean condicion(double saldo){
        //Se verifica si el saldo es diferente de 0
        return saldo!=0;
    }

    //Metodo para aporbar un prestamo a un cliente
    public boolean aprobarPrestamo(Cliente cliente, double monto){
        if(condicion(cliente.getSaldo())){
            cliente.solicitarPrestamo(monto);
            System.out.println("Prestamo de "+ monto+" aprobado");
            return true;
        }
        else {
            System.out.println("Prestamo de "+monto+" rechazado");
            return false;
        }
    }

    //Metodo para evaluar a un empleado
    public void evaluarEmpleado(Empleado empleado, String evaluacion){
        System.out.println("Empleado: "+empleado+"\nDesempeño: "+ evaluacion);
    }

}