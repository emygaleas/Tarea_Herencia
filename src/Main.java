// importar Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crear objeto scanner
        Scanner sc = new Scanner(System.in);

        // crear menú
        while (true) {
            System.out.println("---------- Bienvenido/a al PoliBanco ----------");
            System.out.println("1. Registrar cliente \n2. Ingresar como cliente \n3. Ingresar como empleado \n4. Salir");
            System.out.println("Ingresa el número de la opción (1-4): ");
            int opcion = sc.nextInt();

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
                    Cliente clienteNuevo = new Cliente(nombre,cedula,direccion,telefono,tipo_cuenta);
                case 2:
                    System.out.println("---------- Ingreso al sistema ----------");
                    System.out.println("Ingrese su nombre: ");
                    String usuario = sc.nextLine();
                    System.out.println("Ingrese su número de cédula: ");
                    String n_cedula = sc.nextLine();
                    if (clienteNuevo.ingresarAlSistema(usuario,n_cedula)){
                        System.out.println("Acceso exitoso.");
                    }else if (clienteNuevo == null){
                        System.out.println("Debe crear una cuenta para ingresar como cliente.");
                    }else{
                    System.out.println("Datos incorrectos.");
                }
                    break;
                case 3:
                    System.out.println("---------- Ingresar al sistema de empleados ----------");

            }
        }
    }
}