public class Cocinero {

    // Atributos de la clase 'Cocinero'
    String nombre;
    int aniosExperiencia;
    String especialidad;

    // Metodo contrsuctor de la clase
    public Cocinero (String nombre, int aniosExperiencia, String especialidad) {

        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
        this.especialidad = especialidad;

    }

    // Metodos

    public void nostrarInformacionCocinero () {

        System.out.println("\nInformación del cocinero: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Años de experiencia: " + aniosExperiencia);
        System.out.println("Especialidad: " + especialidad);

    }

}
