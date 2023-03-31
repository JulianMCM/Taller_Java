import java.util.Scanner;

public class punto4 {
    private static int num, resultado;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Por favor ingrese un numero a multiplicar");
        num = input.nextInt();

        for(int i = 1; i <= 10; i++){
            resultado = i * num;
            System.out.println(i + " * " + num + " = " + resultado);
        }

    }
}
