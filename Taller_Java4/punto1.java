import java.util.Scanner;

/**
 * punto1
 */
public class punto1 {
    private static int i, j;
    static String [] vector = new String [5];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        for (i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero");
            vector[i] = input.next();
        }

        for (j = 0; j < vector.length; j++) {
            System.out.println("[" + j + "]" + vector[j]);
        }
    }
}