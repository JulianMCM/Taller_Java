import java.util.Scanner;
import clases.mascota;

public class punto5 {
    private static String nombreMascota, nombreDueno, tipoMascota;
    private static int edadMascota;

    public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Por favor ingrese el nombre de su mascota");
                nombreMascota = input.nextLine();
                System.out.println("Por favor ingrese la edad de su mascota");
                edadMascota = input.nextInt();
                System.out.println("Por favor ingrese el tipo de mascota");
                tipoMascota = input.next();
                System.out.println("Por favor ingrese su nombre completo");
                nombreDueno = input.next();
            }
            mascota mascota1 = new mascota(nombreMascota, nombreDueno, tipoMascota, edadMascota);
            System.out.println(mascota1.getNombreMascota() + " es un(a) " + mascota1.getTipoMascota() + ", el cual, tiene " + mascota1.getEdadMascota() + " años de edad, y " + mascota1.getNombreDueno() + " es actualmente su dueño(a)");
    }
}
