import com.sun.source.tree.ConstantCaseLabelTree;

public class Cliente extends Persona{
    protected String tipo_cuenta;
    //metodo constructor
    public Cliente(String nombre, String cedula, String direccion, String telefono, String tipo_cuenta) {
        super(nombre, cedula, direccion, telefono);
        this.tipo_cuenta = tipo_cuenta;
    }

    //metodos
    public boolean ingresarAlSistema(String usuario, String password) {
        return usuario
    } //no estoy segura

}
