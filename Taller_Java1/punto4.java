import clases.ciudad;
import java.util.Scanner;
public class punto4 {
    private static String ciudadCapital, pais;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre de una ciudad capital");
            ciudadCapital = input.nextLine();
            System.out.println("Ingrese el pais de dicha ciudad");
            pais = input.nextLine();
        }
        ciudad ciudad1 = new ciudad(ciudadCapital, pais);
        System.out.println("La ciuada de " + ciudad1.getCiudadCapital() + ", es la capital del pais " + ciudad1.getPais());
    }
    
}