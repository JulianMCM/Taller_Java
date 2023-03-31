import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import clases.motocicleta;

public class punto6 {

    static motocicleta ingresarMoto(String placa, String modelo, String observaciones){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = Date.from(Instant.now());      
		String dateToStr = dateFormat.format(date);
        motocicleta moto = new motocicleta(placa, modelo, "", dateToStr, "", observaciones, "");
        System.out.println("La informacion ingresada es la siguiente: \n" + "La motocicleta con placas: " + 
        moto.getPlaca() +"\n" + "De tipo: " + moto.getModelo() + "\n" + "Fue ingresada el dia: " + 
        moto.getIngreso() + "\n" + "Con las siguientes observaciones: " + moto.getObservaciones() + "\n");
        return moto;
    }

    static motocicleta salidaMoto(String placa, motocicleta moto){
        int validacion;
        String arreglos, novedades;
         
            System.out.println("¿Se ha realizado algun arreglo que involucre el cambio de piezas?\n" + 
            "1. Si" + " " + "2. No");
            validacion = input.nextInt();

            if (validacion == 1) {
                System.out.println("Ingrese los repuestos utilizados");
                arreglos = input.next();
                moto.setArreglos(arreglos);
                System.out.println("Ingrese las novedades realizadas a la motocicleta");
                novedades = input.next();
                moto.setNovedades(novedades);

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = Date.from(Instant.now());      
                String dateToStr = dateFormat.format(date);
                moto.setSalida(dateToStr);
                System.out.println("La informacion ingresada es la siguiente: \n" + "La motocicleta con placas: " + 
                moto.getPlaca() +"\n" + "De tipo: " + moto.getModelo() + "\n" + "Fue ingresada el dia: " + 
                moto.getIngreso() + "\n" + "Y retirada el dia: " + moto.getSalida() + "\n" + "Con las siguientes observaciones: " + 
                moto.getObservaciones() + "\n" +"Se le hicieron los siguientes arreglos: " + moto.getNovedades() + "\n" + 
                "Utilizando los siguientes recambios: " + moto.getArreglos() + "\n");
                return moto;
            } else {
                System.out.println("Ingrese las novedades realizadas a la motocicleta");
                novedades = input.next();
                moto.setNovedades(novedades);

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = Date.from(Instant.now());      
                String dateToStr = dateFormat.format(date);
                moto.setSalida(dateToStr);
                System.out.println("La informacion ingresada es la siguiente: \n" + "La motocicleta con placas: " + 
                moto.getPlaca() +"\n" + "De tipo: " + moto.getModelo() + "\n" + "Fue ingresada el dia: " + 
                moto.getIngreso() + "\n" + "Y retirada el dia: " + moto.getSalida() + "\n" + "Con las siguientes observaciones: " + 
                moto.getObservaciones() + "\n" +"Se le hicieron los siguientes arreglos: " + moto.getNovedades() + "\n");
                return moto;
            }
        
    }

    private static String placa, modelo, observaciones;
    private static int opcion = 0;
    private static boolean control = true;
    private static motocicleta moto;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            while (control == true) {
                System.out.println("Bienvenido al taller de motos El Maquinista\n" + "Por favor elija la opcion deseada\n" +
                "1. Ingresar motocicleta\n" + "2. Salida motocicleta\n" +
                "0. Salir");

                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Por favor digite la placa de la motocicleta");
                        placa = input.next();
                        System.out.println("Por favor digite el modelo de la motocicleta");
                        modelo = input.next();
                        System.out.println("Por favor digite las obervaciones por parte del cliente dadas a la motocicleta");
                        observaciones = input.next();
                        moto = ingresarMoto(placa, modelo, observaciones);
                        break;

                    case 2:
                        System.out.println("Por favor digite la placa de la motocicleta a retirar");
                        placa = input.next();
                        moto = salidaMoto(placa, moto);
                        break;

                    case 0:
                        control = false;
                        break;
                
                    default:
                        break;
                }
            }
    }
}
