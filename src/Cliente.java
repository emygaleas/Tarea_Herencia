import com.sun.source.tree.ConstantCaseLabelTree;

public class Cliente extends Persona{
    private String tipo_cuenta;
    private double saldo;
    private String TarjetaCredito;

    //metodo constructor
    public Cliente(String nombre, String cedula, String direccion, String telefono, String tipo_cuenta, double saldo, String TarjetaCredito) {
        super(nombre, cedula, direccion, telefono);
        this.tipo_cuenta = tipo_cuenta;
        this.saldo=0;
        this.TarjetaCredito=TarjetaCredito;
    }

    //metodos
    public boolean ingresarAlSistema(String nombre, String cedula) {
        return this.nombre.equals(nombre) && this.cedula.equals(cedula);
    }

    public void registrarCuenta(String tipo){
        this.tipo_cuenta=tipo;
        System.out.println("Cuenta: "+tipo+" registrada");
    }

    public void solicitarPrestamo(double monto){
        this.saldo+=monto;
        System.out.println("Su prestamo es de: "+monto+"\nTotal de saldo: "+saldo);
    }

    public void agregarTarjetaCredito(String TarjetaCredito){
        this.TarjetaCredito=TarjetaCredito;
        System.out.println("Ingrese los numeros de su tarjeta: "+TarjetaCredito);
    }

    public void verResumenFinanciero(){
        System.out.println("---------RESUMEN FINANCIERO-------\n");
        System.out.println("Cliente: "+nombre+"\nCuenta: "+tipo_cuenta+"\nTarjeta de Credito: "+TarjetaCredito+"\nSaldo total: "+saldo);
    }
}
