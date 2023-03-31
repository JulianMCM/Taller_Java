import java.util.Scanner;

import clases.persona;

public class punto2 {

    private static String nombre, apellido;
    private static int edad;
    private static double estatura;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite su nombre");
            nombre = input.nextLine();
            System.out.println("Digite su apellido");
            apellido = input.nextLine();
            System.out.println("Digite su edad");
            edad = input.nextInt();
            System.out.println("Digite su estatura");
            estatura = input.nextDouble();
        }
        persona persona1 = new persona(nombre, apellido, "", "", "", "", edad, estatura);

        System.out.println("Hola " + persona1.getNombre() + " " + persona1.getApellido() + " tu estatura es " + persona1.getEstatura() + " y tu edad es " + persona1.getEdad());
    }
    
}
