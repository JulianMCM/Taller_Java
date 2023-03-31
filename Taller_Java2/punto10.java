import java.util.Scanner;

import clases.cuenta;

public class punto10 {

    static void realizarRetiro(double retiro){
        if (retiro > cuenta1.getCantidad()) {
            System.out.print("El valor a retirar supera la cantidad que posee actualmente");
            return;
        } else {
            cuenta1.setCantidad(cuenta1.getCantidad() - retiro);
            System.out.println("Retirando " + retiro + "$ Por favor espere\n" +
            cuenta1.getCantidad() + "$ restantes en su cuenta\n");
            return;
        }
    }

    static void realizarIngreso(double ingreso){
        if (ingreso <= 0) {
            System.out.println("El valor a ingresar no es valido");
            return;
        } else {
            cuenta1.setCantidad(ingreso + cuenta1.getCantidad());
            System.out.println("Depositando " + ingreso + "$ a su cuenta\n" +
            "Actualmente tiene " + cuenta1.getCantidad() + "$ en su cuenta\n");
            return;
        }
    }

    static void consultarSaldo(){
        System.out.println("Actualmente el tirular" + cuenta1.getTitular() + " posee " 
        + cuenta1.getCantidad() + "$ en su cuenta");
        return;
    }

    private static int opcion;
    private static double ingreso, retiro;
    private static boolean control = true;
    static Scanner input = new Scanner(System.in);

    static cuenta cuenta1 = new cuenta("Julian Mauricio Correa Martinez", 300000.80);

    public static void main(String[] args) {
        
        while (control == true) {
            System.out.println("Bienvenido a su banco fiel\n" + "Por favor elija la opcion deseada\n" +
            "1. Realizar retiro\n" + "2. Realizar ingreso\n" + "3. Consultar saldo\n" +
            "0. Salir\n");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Por favor ingrese el monto a retirar\n");
                    retiro = input.nextDouble();
                    realizarRetiro(retiro);
                    break;

                case 2:
                    System.out.println("Por favor ingrese el monto a depositar\n");
                    ingreso = input.nextDouble();
                    realizarIngreso(ingreso);
                    break;

                case 3:
                    consultarSaldo();
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
