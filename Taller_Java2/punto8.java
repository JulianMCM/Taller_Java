import java.util.Scanner;

import clases.torta;

public class punto8 {

    static void registrarPedido(int opcionTorta){
        
        int i;

        if (opcionTorta == 1) {
            System.out.println("Los detalles del pedido son los siguientes: \n" +
            "Tipo de torta: " + torta1.getNombreTorta() + "\n" +
            "Sabor: " + torta1.getSabor() + "\n" +
            "Decoraciones: " + torta1.getDecoracion() + "\n" +
            "Porciones: " + torta1.getPorciones() + "\n");
            i = torta1.getNventas();
            torta1.setNventas(i + 1);
            return;
        } else {
            if (opcionTorta == 2) {
                System.out.println("Los detalles del pedido son los siguientes: \n" +
                "Tipo de torta: " + torta2.getNombreTorta() + "\n" +
                "Sabor: " + torta2.getSabor() + "\n" +
                "Decoraciones: " + torta2.getDecoracion() + "\n" +
                "Porciones: " + torta2.getPorciones() + "\n");
                i = torta2.getNventas();
                torta2.setNventas(i + 1);
                return;
            } else {
                if (opcionTorta == 3) {
                    System.out.println("Los detalles del pedido son los siguientes: \n" +
                    "Tipo de torta: " + torta3.getNombreTorta() + "\n" +
                    "Sabor: " + torta3.getSabor() + "\n" +
                    "Decoraciones: " + torta3.getDecoracion() + "\n" +
                    "Porciones: " + torta3.getPorciones() + "\n");
                    i = torta3.getNventas();
                    torta3.setNventas(i + 1);
                    return;
                } else {
                    System.out.println("La opcion elegina no esta dispobible en estos momentos");
                    return;
                }
            }
        }
    }

    static void tortasDisponibles(){

        System.out.println("Esta es una lista de las tortas disponibles: \n" +
        torta1.getNombreTorta() + " sabor " + torta1.getSabor() + " con " + 
        torta1.getDecoracion() + " de " + torta1.getPorciones() + " porciones.\n" +
        torta2.getNombreTorta() + " sabor " + torta2.getSabor() + " con " + 
        torta2.getDecoracion() + " de " + torta2.getPorciones() + " porciones.\n" +
        torta3.getNombreTorta() + " sabor " + torta3.getSabor() + " con " + 
        torta3.getDecoracion() + " de " + torta3.getPorciones() + " porciones.\n");
        return;
    }

    static int consultarVentas(int ventas){

        ventas = torta1.getNventas() + torta2.getNventas() + torta3.getNventas();
        System.out.println("Ventas realizadas el dia de hoy: \n" +
        "Se han vendido un total de " + ventas + " tortas el dia de hoy.\n" +
        "Estas ventas incluyen " + torta1.getNventas() + " " + torta1.getNombreTorta() +
        " vendidas\n" + torta2.getNventas() + " " + torta2.getNombreTorta() +
        " vendidas\n" + torta3.getNventas() + " " + torta3.getNombreTorta() +
        " vendidas\n");

        return ventas;
    }
    
    private static boolean control = true;
    private static int ventas = 0, opcionTorta, opcion;
    static Scanner input = new Scanner(System.in);

    static torta torta1 = new torta("Torta de dos pisos", "Chocolate", "Coco rayado", 8, 0);
    static torta torta2 = new torta("Torta fria", "Mora", "Pedacitos de chocolate", 4, 0);
    static torta torta3 = new torta("Torta de tres pisos", "Naranja", "Crema de vainilla", 6, 0);
    

    public static void main(String[] args) {
        
        while (control == true) {
            System.out.println("Bienvenido a la pasteleria de Don Carlos\n" + "Por favor elija la opcion deseada\n" +
            "1. Registrar pedido\n" + "2. Tortas disponibles\n" + "3. Numero de ventas realizadas\n" +
            "0. Salir");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Por favor seleccione la torta deseada\n" +
                    "1. " + torta1.getNombreTorta() + " sabor " + torta1.getSabor() + " con " + 
                    torta1.getDecoracion() + " de " + torta1.getPorciones() + " porciones.\n" +
                    "2. " + torta2.getNombreTorta() + " sabor " + torta2.getSabor() + " con " + 
                    torta2.getDecoracion() + " de " + torta2.getPorciones() + " porciones.\n" +
                    "3. " + torta3.getNombreTorta() + " sabor " + torta3.getSabor() + " con " + 
                    torta3.getDecoracion() + " de " + torta3.getPorciones() + " porciones.\n");

                    opcionTorta = input.nextInt();

                    switch (opcionTorta) {
                        case 1:
                            registrarPedido(opcionTorta);
                            break;

                        case 2:
                            registrarPedido(opcionTorta);
                            break;

                        case 3:
                            registrarPedido(opcionTorta);
                            break;
                    
                        default:
                            break;
                    }
                    break;

                case 2:
                    tortasDisponibles();
                    break;

                case 3:
                    consultarVentas(ventas);
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
