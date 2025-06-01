import java.util.Scanner;

public class Empleado extends Persona{
    protected String usuario;
    protected String clave;
    protected String rol;

    public Empleado(String nombre, String cedula, String direccion, String telefono, String usuario, String clave, String rol) {
        super(nombre, cedula, direccion, telefono);
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Empleado");
    }

    public boolean autenticarEmpleado(String usuario, String clave){
        return this.usuario.equals(usuario) && this.clave.equals(clave);
    }

    public void crearCuentaParaCliente(Cliente cliente, String tipo){
        cliente.registrarCuenta(tipo);
    }

    public void modificarDatosClientes(Cliente cliente){
        Scanner sc=new Scanner(System.in);
        System.out.println("Direccion: ");
        String nuv_direccion=sc.nextLine();
        System.out.println("Telefono: ");
        String nuv_telefono=sc.nextLine();
        cliente.actualizarDatos(nuv_direccion,nuv_telefono);
        System.out.println("Los datos se han actualizado de forma correcta");
    }

}
