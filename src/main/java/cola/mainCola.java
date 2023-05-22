package cola;

import excepciones.ColaVaciaException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Farit
 */
public class mainCola {

    static Cola filaDeBoleteria = new Cola();
    static Scanner sc = new Scanner(System.in);
    static Boleteria boleto = new Boleteria();

    public static void main(String[] args) throws ColaVaciaException {

        System.out.println("Bienvenido a la boletería del teatro");
        System.out.println("Por favor ingrese el precio de las entradas:");

        cargarPreciosBoletos();

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1) Insertar persona a la cola");
            System.out.println("2) Atender persona de la cola");
            System.out.println("3) Mostrar datos de la próxima persona a ser atendida");
            System.out.println("4) Mostrar total de personas en la cola");
            System.out.println("5) Mostrar cantidad de boletos vendidos y monto recaudado");
            System.out.println("6) Mostrar cantidad de boletos existentes");
            System.out.println("0) Finalizar la aplicación");
            System.out.print("Ingrese opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    insertarPersona();
                    break;
                case 2:
                    atenderPersona();
                    break;
                case 3:
                    mostrarProximaPersona();
                    break;
                case 4:
                    mostrarTotalPersonas();
                    break;
                case 5:
                    mostrarTotalBoletosVendidosYMontoRecaudado();
                    break;
                case 6:
                    mostrarCantidadBoletosExistentes();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        resumenOperaciones();
    }

    public static void insertarPersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = sc.next();
        Persona persona = new Persona(); // crear un nuevo objeto Persona
        persona.setNombre(nombre);

        ArrayList<Boleto> boletos = new ArrayList<>();

        while (true) {
            System.out.println("1- Graderia: " + boleto.getPrecioGraderia()
                    + " | 2- Platea: " + boleto.getPrecioPlatea()
                    + " | 3- VIP: " + boleto.getPrecioVIP()
                    + " | 4- Terminar compra");
            System.out.print("Ingrese un numero segun su compra: ");
            int n = sc.nextInt();

            if (n == 4) {
                break; // salir del bucle si el usuario termina la compra
            }
            if (n > 4) {
                System.out.println("Error, vuelva a solicitar");
                break; // salir del bucle si el usuario termina la compra
            }
            System.out.print("Ingrese la cantidad de boletos a comprar: ");
            int cant = sc.nextInt();

            switch (n) {
                case 1:
                    boletos.add(new Boleto("Gradería", cant, boleto.getPrecioGraderia()));
                    break;
                case 2:
                    boletos.add(new Boleto("Platea", cant, boleto.getPrecioPlatea()));
                    break;
                case 3:
                    boletos.add(new Boleto("VIP", cant, boleto.getPrecioVIP()));
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        persona.setBoletos(boletos); // asignar los boletos comprados a la persona
        filaDeBoleteria.encolar(persona); // agregar la persona a la cola
    }

    public static void atenderPersona() throws ColaVaciaException {
        try {
            System.out.println(filaDeBoleteria.consultar());
        } catch (ColaVaciaException e) {
            System.out.println(e);
        }
    }

    public static void mostrarProximaPersona() throws ColaVaciaException {
        try {
            filaDeBoleteria.descolar();
            System.out.println("Proxima persona a ser atendida:" + filaDeBoleteria.consultar());
        } catch (ColaVaciaException e) {
            System.out.println(e);
        }
    }

    public static void mostrarTotalPersonas() {

    }

    public static void mostrarTotalBoletosVendidosYMontoRecaudado() {

    }

    public static void mostrarCantidadBoletosExistentes() {

    }

    public static void resumenOperaciones() {

    }

    private static void cargarPreciosBoletos() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese precio del boleto VIP: ");
        int precioVIP = scanner.nextInt();
        System.out.print("Ingrese precio del boleto Platea: ");
        int precioPlatea = scanner.nextInt();
        System.out.print("Ingrese precio del boleto Gradería: ");
        int precioGraderia = scanner.nextInt();

        boleto.setPrecioGraderia(precioGraderia);
        boleto.setPrecioPlatea(precioPlatea);
        boleto.setPrecioVIP(precioVIP);

    }

}
