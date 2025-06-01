public class Cliente extends Persona{
    private String tipo_cuenta;
    private double saldo;
    private String TarjetaCredito;

    //metodo constructor
    public Cliente(String nombre, String cedula, String direccion, String telefono, String tipo_cuenta) {
        super(nombre, cedula, direccion, telefono);
        this.tipo_cuenta = tipo_cuenta;
        this.saldo=0;
        this.TarjetaCredito="No asignada";
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Cliente con cuenta "+ tipo_cuenta);
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
        if (monto<=0){
            System.out.println("El monto debe ser positivo");
        }
        this.saldo+=monto;
        System.out.println("Su prestamo es de: "+monto+"\nTotal de saldo: "+saldo);
    }

    public void agregarTarjetaCredito(String TarjetaCredito){
        if (TarjetaCredito == null){
            System.out.println("Numero de tarjeta invalido");
        }
        this.TarjetaCredito=TarjetaCredito;
        System.out.println("Tarjeta ingresada exitosamente");
    }

    public void verResumenFinanciero(){
        System.out.println("---------RESUMEN FINANCIERO-------\n");
        System.out.println("Cliente: "+nombre+"\nCuenta: "+tipo_cuenta+"\nTarjeta de Credito: "+TarjetaCredito+"\nSaldo total: "+saldo);
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTarjetaCredito() {
        return TarjetaCredito;
    }

    public void retirarMonto(double monto){
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        } else{
            System.out.println("Fondos insuficientes.");
        }
    }

    public void depositarMonto(double monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado con éxito.");
        }
    }

}
