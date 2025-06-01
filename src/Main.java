// importar Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crear objeto scanner
        Scanner sc = new Scanner(System.in);
        //crear un array de clientes
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        //crear un array de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        // crear empleados con datos quemados de ejemplo:
        empleados.add(new BalconServicios("Ana Perez", "1234567890", "Calle 1", "0999999999", "balcon1", "pass1"));
        empleados.add(new Cajero("Luis Gomez", "0987654321", "Av. Siempre Viva", "0888888888", "cajero1", "pass2"));
        empleados.add(new JefeAgencia("Maria Lopez", "1122334455", "Calle Falsa", "0777777777", "jefe1", "pass3"));

        BalconServicios empleadoBalcon = new BalconServicios("Ana","1234567890", "Quito", "0987654321", "anaUsuario", "clave123");
        BalconServicios empleadoBalcon1 = new BalconServicios("a","a", "a", "a", "a", "a");
        Empleado empleado= new Empleado("Admin","1","1","1","admin","admin","admin");

        // crear menú
        while (true) {
            System.out.println("---------- Bienvenido/a al PoliBanco ----------");
            System.out.println("1. Registrar cliente \n2. Ingresar como cliente \n3. Ingresar como empleado \n4. Salir");
            System.out.print("Ingresa el número de la opción (1-4): ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar el buffer

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
                    System.out.print("Tipo de cuenta (Ahorros/Corriente): ");
                    String tipo_cuenta = sc.nextLine();
                    // se agregan los datos ingresados por teclado a un nuevo objeto cliente
                    Cliente nuevoCliente = new Cliente(nombre, cedula, direccion, telefono, tipo_cuenta);
                    listaClientes.add(nuevoCliente);
                    System.out.println("\nCliente registrado exitosamente");
                    break;
                case 2:
                    System.out.println("---------- Ingreso al sistema ----------");

                    System.out.print("Ingrese su nombre: ");
                    String usuario = sc.nextLine();
                    System.out.print("Ingrese su número de cédula: ");
                    String n_cedula = sc.nextLine();

                    Cliente clienteEncontrado = null;

                    for (Cliente c : listaClientes) {
                        if (c.ingresarAlSistema(usuario, n_cedula)) {
                            clienteEncontrado = c;
                            break;
                        }
                    }
                    if (clienteEncontrado != null) {
                        System.out.println("Acceso exitoso.");
                        menuCliente(clienteEncontrado, sc);
                    } else {
                        System.out.println("Datos incorrectos. Por favor, verifique su nombre o número de cédula.");
                    }

                    break;
                case 3:
                    System.out.println("---------- Ingresar al sistema de empleados ----------");
                    System.out.print("Ingrese su usuario: ");
                    String userEmpleado = sc.nextLine();
                    System.out.print("Ingrese su clave: ");
                    String password = sc.nextLine();

                    Empleado encontrado = null;
                    for (Empleado emp : empleados) {
                        if (emp.autenticarEmpleado(userEmpleado, password)) {
                            encontrado = emp;
                            break;
                        }
                    }

                    if (encontrado != null) {
                        System.out.println("Acceso exitoso.");
                        menuEmpleado(encontrado, sc, listaClientes);
                    } else {
                        System.out.println("Datos incorrectos.\n");
                    }
                    break;
                case 4:
                    System.out.println("\n¡Gracias por usar nuestros servicios!");
                    System.out.println("Saliendo...");
                    return; // no se usa break, ya que solo saldría del switch pero no del bucle while
                default:
                    System.out.println("Por favor ingresa una opción válida.\n");
            }
        }
    }

    private static void menuCliente(Cliente cliente, Scanner sc){
        while (true){
            System.out.println("\n--------MENU DEL CLIENTE--------\n1. Ver resumen financiero\n2. Solicitar prestamo\n3. Agregar tarjeta de credito\n4. Volver al menu principal\n");
            System.out.print("Seleccione una opcion: ");
            int opcion =sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    cliente.verResumenFinanciero();
                    break;
                case 2:
                    System.out.print("\nMonto del prestamo: ");
                    double monto = sc.nextDouble();
                    cliente.solicitarPrestamo(monto);
                    break;
                case 3:
                    System.out.print("\nNumero de tarjeta: ");
                    String tarjeta = sc.nextLine();
                    cliente.agregarTarjetaCredito(tarjeta);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }

    private static void menuEmpleado(Empleado empleado, Scanner sc, ArrayList<Cliente> listaClientes) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n-------- MENÚ DE EMPLEADO --------");

            // Según el tipo de empleado mostramos diferentes opciones
            if (empleado instanceof BalconServicios) {
                System.out.println("1. Registrar nuevo cliente");
                System.out.println("2. Actualizar datos de cliente");
            } else if (empleado instanceof Cajero) {
                System.out.println("1. Realizar depósito");
                System.out.println("2. Realizar retiro");
            } else if (empleado instanceof JefeAgencia) {
                System.out.println("1. Aprobar préstamo");
                System.out.println("2. Evaluar empleados");
            }

            System.out.println("3. Cerrar sesión");

            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    if (empleado instanceof BalconServicios bs) {
                        System.out.println("---------- Registro de cliente ----------");
                        System.out.print("Ingrese el nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el número de cédula: ");
                        String cedula = sc.nextLine();
                        System.out.print("Ingrese la dirección: ");
                        String direccion = sc.nextLine();
                        System.out.print("Ingrese el número de celular: ");
                        String telefono = sc.nextLine();
                        System.out.print("Tipo de cuenta (Ahorros/Corriente): ");
                        String tipo_cuenta = sc.nextLine();
                        Cliente nuevoCliente = bs.registrarNuevoCliente(nombre, cedula, direccion, telefono, tipo_cuenta);
                        //Cliente nuevoCliente = ((BalconServicios) empleado).registrarNuevoCliente(nombre, cedula, direccion, telefono, tipo_cuenta);
                        listaClientes.add(nuevoCliente);
                        System.out.println("Cliente registrado exitosamente por el empleado.");
                    } else if (empleado instanceof Cajero cajero) {
                        System.out.println("Ingrese la cédula del cliente: ");
                        String n_cedula = sc.nextLine();
                        Cliente cliente = buscarCliente(n_cedula, listaClientes);
                        if (cliente != null) {
                            System.out.print("Monto a depositar: ");
                            double monto = sc.nextDouble();
                            cajero.procesarDeposito(cliente, monto);
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                    } else if (empleado instanceof JefeAgencia) {
                        System.out.println("Aprobando préstamo...");
                    }

                    break;
                case 2:
                    if (empleado instanceof BalconServicios bs) {
                        System.out.print("Cédula cliente: ");
                        String cedula = sc.nextLine();
                        Cliente cliente = buscarCliente(cedula, listaClientes);
                        if (cliente != null) {
                            bs.actualizarDatosCliente(cliente);
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                    } else if (empleado instanceof Cajero cajero) {
                        System.out.print("Ingrese la cédula del cliente: ");
                        String cedula = sc.nextLine();
                        Cliente cliente = buscarCliente(cedula, listaClientes);
                        if (cliente != null) {
                            System.out.print("Monto a retirar: ");
                            double monto = sc.nextDouble();
                            cajero.procesarRetiro(cliente, monto);
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                    } else if (empleado instanceof JefeAgencia) {
                        System.out.println("Evaluando empleados...");
                    }
                    break;
                case 3:
                    System.out.println("Cerrando sesión...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
    private static Cliente buscarCliente(String cedula, ArrayList<Cliente> lista) {
        for (Cliente c : lista) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
    }
}