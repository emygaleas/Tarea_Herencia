public abstract class Persona {
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

    //Se establecen los getters de nombre, cedula, direccion y telefono
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}
