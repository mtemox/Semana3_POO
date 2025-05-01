import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Parte 1 finalizada

        // Nombre
        System.out.println("Ariel Macias");

        // Creo un Scanner
        Scanner sc = new Scanner(System.in);

        // Creo los objetos con datos de entrada por teclado
        System.out.println("Cocinero. 1");
        System.out.print("Ingrese el nombre: ");
        String nombreC1 = sc.nextLine();
        System.out.print("Ingrese los años de experiencia: ");
        int aniosC1 = sc.nextInt(); sc.nextLine();
        System.out.print("Ingrese la especialidad: ");
        String especialidadC1 = sc.nextLine();

        Cocinero c1 = new Cocinero(nombreC1, aniosC1, especialidadC1);

        System.out.println("Cocinero. 2");
        System.out.print("Ingrese el nombre: ");
        String nombreC2 = sc.nextLine();
        System.out.print("Ingrese los años de experiencia: ");
        int aniosC2 = sc.nextInt(); sc.nextLine();
        System.out.print("Ingrese la especialidad: ");
        String especialidadC2 = sc.nextLine();

        Cocinero c2 = new Cocinero(nombreC2, aniosC2, especialidadC2);

        System.out.println("Cocinero. 3");
        System.out.print("Ingrese el nombre: ");
        String nombreC3 = sc.nextLine();
        System.out.print("Ingrese los años de experiencia: ");
        int aniosC3 = sc.nextInt(); sc.nextLine();
        System.out.print("Ingrese la especialidad: ");
        String especialidadC3 = sc.nextLine();

        Cocinero c3 = new Cocinero(nombreC3, aniosC3, especialidadC3);

        // Llamada a los métodos
        c1.nostrarInformacionCocinero();
        c2.nostrarInformacionCocinero();
        c3.nostrarInformacionCocinero();

    }
}