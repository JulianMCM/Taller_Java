import java.util.Scanner;
import clases.persona;
/**
 * punto1
 */

public class punto3 {

    static void confirmarEdad(int edad, String nombre, String apellido){
    
        if (edad >= 18){
            System.out.println(nombre + " " + apellido + " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
            return;
        } else {
            System.out.println(nombre + " " + apellido + " usted es menor de edad, por lo tanto no puede entrar a la fiesta, por favor devuelvase a su casa");
            return;
        }
    }
    
    private static String nombre, apellidos;
    private static int edad;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Por favor ingrese su nombre");
            nombre = input.nextLine();
            System.out.println("Por favor ingrese su apellido");
            apellidos = input.nextLine();
            System.out.println("Por favor ingrese su edad");
            edad = input.nextInt();
        }
        persona persona1 = new persona(nombre, apellidos, edad);
        confirmarEdad(persona1.getEdad(), persona1.getNombre(), persona1.getApellido());
    }

    
}