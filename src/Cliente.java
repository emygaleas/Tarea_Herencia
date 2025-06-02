public class Cliente extends Persona{
    //Se inicializan los atributos de la subclase Persona
    private String tipo_cuenta;
    private double saldo;
    private String TarjetaCredito;

    //metodo constructor
    public Cliente(String nombre, String cedula, String direccion, String telefono, String tipo_cuenta) {
        //Llamada al constructor de la clase Persona
        super(nombre, cedula, direccion, telefono);
        //Inicializacion de atributos especificos de la clase Cliente
        this.tipo_cuenta = tipo_cuenta;
        this.saldo=0;
        this.TarjetaCredito="No asignada";
    }

    //Metodo para mostrar el rol del cliente
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Cliente con cuenta "+ tipo_cuenta);
    }

    //Metodo para la autenticacion del cliente
    public boolean ingresarAlSistema(String nombre, String cedula) {
        return this.nombre.equals(nombre) && this.cedula.equals(cedula);
    }

    //Metodo para registrar una cuenta del cliente
    public void registrarCuenta(String tipo){
        this.tipo_cuenta=tipo;
        System.out.println("Cuenta: "+tipo+" registrada");
    }

    //Metodo para solicitar un prestamo
    public void solicitarPrestamo(double monto){
        if (monto<=0){
            System.out.println("El monto debe ser positivo");
            return;
        }
        this.saldo+=monto;
        System.out.println("Su prestamo es de: "+monto+"\nTotal de saldo: "+saldo);
    }

    //Metodo para agregar una tarjeta de credito
    public void agregarTarjetaCredito(String TarjetaCredito){
        if (TarjetaCredito == null){
            System.out.println("Numero de tarjeta invalido");
        }
        this.TarjetaCredito=TarjetaCredito;
        System.out.println("Tarjeta ingresada exitosamente");
    }

    //Metodo para ver el resumen financiero del cliente
    public void verResumenFinanciero(){
        System.out.println("---------RESUMEN FINANCIERO-------\n");
        System.out.println("Cliente: "+nombre+"\nCuenta: "+tipo_cuenta+"\nTarjeta de Credito: "+TarjetaCredito+"\nSaldo total: "+saldo);
    }

    //Getters y Setters para los atributos privados
    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTarjetaCredito() {
        return TarjetaCredito;
    }

    //Metodo para retirar un monto del saldo del cliente
    public void retirarMonto(double monto){
        if (monto <= 0) {
            System.out.println("Monto inválido.");
            return;
        }
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro realizado con éxito.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    //Metodo para depositar un monto en el saldo del cliente
    public void depositarMonto(double monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado con éxito.");
        }
    }

}
