import java.util.Scanner;

import clases.persona;

public class punto1 {

    private static String nombre, apellido;

    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite su nombre");
            nombre = input.nextLine();
            System.out.println("Digite su apellido");
            apellido = input.nextLine();
        }
        persona persona1 = new persona (nombre, apellido, "", "", "", "", 0, 0);
        
        System.out.println("Hola " + persona1.getNombre() +" "+ persona1.getApellido());
    }
}