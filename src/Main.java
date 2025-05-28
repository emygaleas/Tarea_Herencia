// importar Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crear objeto scanner
        Scanner sc = new Scanner(System.in);
        Cliente cliente=null;

        // crear menú
        while (true) {
            System.out.println("---------- Bienvenido/a al PoliBanco ----------");
            System.out.println("1. Registrar cliente \n2. Ingresar como cliente \n3. Ingresar como empleado \n4. Salir");
            System.out.println("Ingresa el número de la opción (1-4): ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("---------- Registro de cliente ----------");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el número de cédula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Ingrese la dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Ingrese el número de celular: ");
                    String telefono = sc.nextLine();
                    System.out.println("Tipo de cuenta (Ahorros/Corriente): ");
                    String tipo_cuenta = sc.nextLine();
                    cliente = new Cliente(nombre,cedula,direccion,telefono,tipo_cuenta);
                    System.out.println("\nCliente registrado exitosamente");
                    break;
                case 2:
                    System.out.println("---------- Ingreso al sistema ----------");
                    if (cliente == null){
                        System.out.println("Debe crear una cuenta para ingresar como cliente.");
                    break;
                    }

                    System.out.println("Ingrese su nombre: ");
                    String usuario = sc.nextLine();
                    System.out.println("Ingrese su número de cédula: ");
                    String n_cedula = sc.nextLine();
                    if (cliente.ingresarAlSistema(usuario,n_cedula)){
                        System.out.println("Acceso exitoso.");
                        menuCliente(cliente,sc);
                    }else{
                    System.out.println("Datos incorrectos.");
                    }
                    break;
                case 3:
                    System.out.println("---------- Ingresar al sistema de empleados ----------");
            }
        }
    }

    private static void menuCliente(Cliente cliente, Scanner sc){
        while (true){
            System.out.println("\n--------MENU DEL CLIENTE--------\n1.Ver resumen financiero\n2. Solicitar prestamo\n3. Agregar tarjeta de credito\n4. Volver al menu principal\n");
            System.out.println("Seleccione una opcion: ");
            int opcion =sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    cliente.verResumenFinanciero();
                    break;
                case 2:
                    System.out.println("\nMonto del prestamo: ");
                    double monto = sc.nextDouble();
                    cliente.solicitarPrestamo(monto);
                    break;
                case 3:
                    System.out.println("\nNumero de tarjeta: ");
                    String tarjeta=sc.nextLine();
                    cliente.agregarTarjetaCredito(tarjeta);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}