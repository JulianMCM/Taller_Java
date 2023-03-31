import java.util.Scanner;
import clases.persona;

/**
 * punto3
 */
public class punto3 {
    private static String nombre, apellido, nombrePadre, apellidoPadre, nombreMadre, apellidoMadre;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite su nombre");
            nombre = input.nextLine();
            System.out.println("Digite su apellido");
            apellido = input.nextLine();
            System.out.println("Digite el nombre de su Padre");
            nombrePadre = input.nextLine();
            System.out.println("Digite el apellido de su Padre");
            apellidoPadre = input.nextLine();
            System.out.println("Digite el nombre de su Madre");
            nombreMadre = input.nextLine();
            System.out.println("Digite el apellido de su Madre");
            apellidoMadre = input.nextLine();
        }
        persona persona1 = new persona(nombre, apellido, nombrePadre, apellidoPadre, nombreMadre, apellidoMadre, 0, 0);
        System.out.println("Yo " + persona1.getNombre() + " " + persona1.getApellido() + ", soy hijo de " + persona1.getNombreMadre() + " " + persona1.getApellidoMadre() + " y " + persona1.getNombrePadre() + " " + persona1.getApellidoPadre());
    } 
}
