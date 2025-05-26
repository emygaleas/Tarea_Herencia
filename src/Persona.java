public class Persona {
    //atributos
    protected String nombre;
    protected String cedula;
    protected String direccion;
    protected String telefono;
    //metodo constructor
    public Persona(String nombre, String cedula, String direccion, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //metodo para actualizar datos -> concreto
    public void actualizarDatos(String direccion, String telefono){
        this.direccion = direccion;
        this.telefono = telefono;
    }
    //metodo para mostrar el rol de la persona -> abstracto
    public abstract void mostrarRol();
}
