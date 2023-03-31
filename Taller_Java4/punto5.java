import java.util.Scanner;

public class punto5 {

    static int[][] llenarMostrar(String[][] matriz, int[][] matrizX){
        int p = 0, q = 0, j = 0, i = 0;
        for (int x = 0; x < matriz.length; x++) {
            j++;
            i = 0;
            for (int y = 0; y < matriz[x].length; y++) {
                if (y == 0 & x == 0) {
                    matriz[x][y] = "       ";
                } else {
                    if (x == 0) {
                        matriz[x][y] = "[    " + p + "    ]";
                        p++;
                        j = 0;
                    } else {
                        if (y == 0 & x != 0) {
                            matriz[x][y] = "[  " + q + "  ]";
                            q++;
                        } else {
                            i++;
                            matriz[x][y] = "[  " + j + " x " + i + "  ]";
                        }
                    }
                }
            }
        }

        i = 0; 
        j = 0;
        for (int x = 0; x < matrizX.length; x++) {
            j++;
            i=0;
            for (int y = 0; y < matrizX[x].length; y++) {
                i++;
                matrizX[x][y] = i*j;
            }
        }

        for (int x = 0; x < matriz.length; x++) {
            System.out.print("");
            for (int y = 0; y < matriz[x].length; y++) {
              System.out.print (matriz[x][y]);
              if (y != matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("");
          }
        return matrizX;
    }

    static String matriz[][] = new String [11][11];
    static int matrizX[][] = new int [10][10];
    private static boolean control=true;
    private static int opcion, fila, columna;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        llenarMostrar(matriz, matrizX);

        while (control == true) {
            System.out.println("Elija la opcion deseada: \n" + "1. Conocer resultado\n" +
            "0. Salir del sistema\n");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero de la fila y columna de la cual desea conocer el resultado\n" +
                    "Ejemplo: Fila: 2, Columna: 4\n" + "Fila: \n");
                    fila = input.nextInt();
                    System.out.println("Columna: \n");
                    columna = input.nextInt();
                    System.out.println(matrizX[fila][columna]);
                    break;
                case 0:
                    System.out.println("Hasta luego\n");
                    control = false;
                    break;
            
                default:
                    System.out.println("La opcion elegida no existe");
                    break;
            }
        }
    }
}
