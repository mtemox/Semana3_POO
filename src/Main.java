import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Parte 1 finalizada

        // Nombre
        System.out.println("Ariel Macias");

        // Creo un Scanner
        Scanner sc = new Scanner(System.in);

        // Preguntar a usuario cuantos cocineros quiere agregar
        System.out.print("¿Cuantos cocineros quiere agregar?: ");
        int cantidad = sc.nextInt(); sc.nextLine();

        // Creo un arreglo
        Cocinero[] cocineros = new Cocinero[cantidad];


        // Bucle para agregar los cocineros
        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nIngrese la información del cocinero (" + (i + 1) + "): ");

            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese los años de experiencia: ");
            int aniosExperiencia = sc.nextInt(); sc.nextLine();
            System.out.print("Ingrese la especialidad: ");
            String especialidad = sc.nextLine();

            cocineros[i] = new Cocinero(nombre, aniosExperiencia, especialidad);

        }

        // Llamada a los métodos
        for (Cocinero cocinero : cocineros) {
            cocinero.nostrarInformacionCocinero();
        }

    }
}