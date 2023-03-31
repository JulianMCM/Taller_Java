import java.util.Scanner;
import clases.persona;

public class punto1 {

    static void confirmarEdad(int edad){
        if(edad >= 18){
            System.out.println("Usted es mayor de edad");
            return;
        }
    }
    
    private static int edad;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Por favor digite su edad");
            edad = input.nextInt();
        }
        persona persona1 = new persona("", "", edad);
        confirmarEdad(persona1.getEdad());
    }
}
