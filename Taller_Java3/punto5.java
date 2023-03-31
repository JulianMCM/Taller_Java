import java.util.Scanner;

import clases.persona;

public class punto5 {

    private static boolean control = true, nombreCapturado = false;
    private static int opcion;
    static Scanner input = new Scanner(System.in);

    static persona persona1 = new persona("");

    public static void main(String[] args) {
        
        while (control == true) {
            System.out.println("Bienvenido al sistema, elija una opcion: \n" +
            "1. Capturar nombre\n" + "2. Saludar persona\n" + "3. Salir sistema");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Como te llamas?");
                    persona1.setNombre(input.next());
                    nombreCapturado = true;
                    break;
                case 2:
                    if (nombreCapturado == true) {
                        System.out.println("Hola " + persona1.getNombre());
                    } else {
                        System.out.println("Para saludarte primero debes de capturar tu nombre");
                    }
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    control = false;
            
                default:
                    System.out.println("la opcion elegida no existe");
                    break;
            }

        }
    }
}
