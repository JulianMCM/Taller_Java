
import java.util.Scanner;

public class punto2 {

    static int[] llenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100+1);
            System.out.println(vector[i]);
        }
        return vector;
    }

    static int[] ordenarVector(int[] vector, int[] vectorPar, int[] vectorImpar){
        boolean control = true;
        while (control == true) {
            if (vector[i] % 2 == 0) {
                vectorPar[i] = vector[i];
                i++;
            } else {
                vectorImpar[i] = vector[i];
                i++;
            }
            if (i >= 20) {
                control = false;
            }
        }
        return vector;
    }

    static int[] mostrarVector(int[] vector, int[] vectorPar, int[] vectorImpar){
        System.out.println("Numero par: ");
        for (int i = 0; i < vectorPar.length; i++) {
            if (vectorPar[i] != 0) {
                System.out.println(vectorPar[i]);
            }
        }
        System.out.println("Numero impar: ");
        for (int i = 0; i < vectorImpar.length; i++) {
            if (vectorImpar[i] != 0) {
                System.out.println(vectorImpar[i]);
            }
        }
        return vector;
    }

    private static int i;
    static int [] vector = new int [20];
    static int [] vectorPar = new int [20];
    static int [] vectorImpar = new int [20];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        llenarVector(vector);
        ordenarVector(vector, vectorPar, vectorImpar);
        mostrarVector(vector, vectorPar, vectorImpar);
    }
}
