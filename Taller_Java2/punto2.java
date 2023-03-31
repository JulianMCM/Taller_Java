import java.util.Scanner;
import clases.persona;

public class punto2 {

    static void confirmarEdad(int edad){
        if(edad < 18){
            System.out.println("Usted es una niño(a)");
            return;
        }
    }
    
    private static int edad;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Por favor ingrese su edad");
            edad = input.nextInt();
        }
        persona persona1 = new persona("", "", edad);
        confirmarEdad(persona1.getEdad());

    }
}
