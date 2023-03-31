import java.util.Scanner;

import clases.formas;

public class punto9 {

    static void areaRectangulo(){
        double area;
        area = forma1.getBase()*forma1.getAltura();
        System.out.println("El area del rectangulo es: " + area);
        return;
    }

    static void areaTriangulo(){
        double area;
        area = forma1.getBase()*forma1.getAltura()/2;
        System.out.println("El area del triangulo es: " + area);
        return;
    }

    static void areaTrapecio(){
        double area;
        area = (forma1.getBase1()+forma1.getBase2())*forma1.getAltura()/2;
        System.out.println("El area del trapecio es: " + area);
        return;
    }
    
    private static int opcion;
    private static boolean control = true;
    static formas forma1 = new formas(0, 0, 0, 0, 0);
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (control == true) {
            System.out.println("Bienvenido, por favor seleccione la operacion a realizar\n" +
            "1. Calcular area del rectangulo\n" + "2. Calcular area del triangulo\n" +
            "3. Calcular area del trapecio\n" + "0. Salir\n");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Por favor ingrese los datos necesarios\n" +
                    "Base del rectangulo: ");
                    forma1.setBase(input.nextDouble());
                    System.out.println("Altura del rectangulo: ");
                    forma1.setAltura(input.nextDouble());
                    areaRectangulo();
                    break;

                case 2:
                    System.out.println("Por favor ingrese los datos necesarios\n" +
                    "Base del triangulo: ");
                    forma1.setBase(input.nextDouble());
                    System.out.println("Altura del triangulo: ");
                    forma1.setAltura(input.nextDouble());
                    areaTriangulo();
                    break;  
                    
                case 3:
                    System.out.println("Por favor ingrese los datos necesarios\n" +
                    "Base mayor del trapecio: ");
                    forma1.setBase1(input.nextDouble());
                    System.out.println("Base menor del trapecio: ");
                    forma1.setBase2(input.nextDouble());
                    System.out.println("Altura del trapecio: ");
                    forma1.setAltura(input.nextDouble());
                    areaTrapecio();
                    break;

                case 0:
                    control = false;
                    break;
            
                default:
                    System.out.println("La opcion elegida no existe");
                    break;
            }
        }
    }
}
