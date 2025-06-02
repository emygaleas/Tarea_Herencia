import java.util.Scanner;

public class Empleado extends Persona{
    //Atributos de la clase Empleado
    protected String usuario;
    protected String clave;
    protected String rol;

    //Constructor
    public Empleado(String nombre, String cedula, String direccion, String telefono, String usuario, String clave, String rol) {
        super(nombre, cedula, direccion, telefono);
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    //Metodo para mostrar el rol del empleado
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Empleado");
    }

    //Metodo para autenticar al empleado
    public boolean autenticarEmpleado(String usuario, String clave){
        return this.usuario.equals(usuario) && this.clave.equals(clave);
    }

    //Metodo para crear una cuenta para un cliente
    public void crearCuentaParaCliente(Cliente cliente, String tipo){
        cliente.registrarCuenta(tipo);
    }

    //Metodo para modificar los datos de un cliente
    public void modificarDatosClientes(Cliente cliente){
        Scanner sc=new Scanner(System.in);
        System.out.println("Direccion: ");
        String nuv_direccion=sc.nextLine();
        System.out.println("Telefono: ");
        String nuv_telefono=sc.nextLine();
        //Se llama al metodo actualizar datos
        cliente.actualizarDatos(nuv_direccion,nuv_telefono);
        System.out.println("Los datos se han actualizado de forma correcta");
    }

}
