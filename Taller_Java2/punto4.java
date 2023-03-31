import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import clases.pelicula;

public class punto4 {

    static void alquilarPelicula(String nombrePelicula, boolean disponible, int opcionPelicula){

        if (opcionPelicula == 1 & disponible == true) {
            System.out.println("Ha adquirido la pelicula " + nombrePelicula);
            pelicula1.setDisponible(false);
            return;
        } else {
            if (opcionPelicula == 2 & disponible == true) {
                System.out.println("Ha adquirido la pelicula " + nombrePelicula);
                pelicula2.setDisponible(false);
                return;
            } else {
                if (opcionPelicula == 3 & disponible == true) {
                    System.out.println("Ha adquirido la pelicula " + nombrePelicula);
                    pelicula3.setDisponible(false);
                    return;
                } else {
                    if (opcionPelicula == 4 & disponible == true) {
                        System.out.println("Ha adquirido la pelicula " + nombrePelicula);
                        pelicula4.setDisponible(false);
                        return;
                    } else {
                        System.out.println("La pelicula " + nombrePelicula + " no esta disponible");
                        return;
                    }
                }
            }
        }
    }

    static void consultarPelicula(){

        List<String> lista = new ArrayList<>();
        
        if (pelicula1.isDisponible() == true) {
            lista.add(pelicula1.getNombrePelicula());
        }
        if (pelicula2.isDisponible() == true) {
            lista.add(pelicula2.getNombrePelicula());
        }
        if (pelicula3.isDisponible() == true) {
            lista.add(pelicula3.getNombrePelicula());
        }
        if (pelicula4.isDisponible() == true) {
            lista.add(pelicula4.getNombrePelicula());
        }

        System.out.println("Esta es una lista de las peliculas disponibles actualmente: \n"
        + lista);
        return;
    }

    static void recibirPelicula(String nombrePelicula, String estadoPelicula){
        if (nombrePelicula.equals(pelicula1.getNombrePelicula())) {
            pelicula1.setDisponible(true);
            pelicula1.setEstadoPelicula(estadoPelicula);
            System.out.println("Usted a ingresado la siguiente informacion\n" +
            "La pelicula " + pelicula1.getNombrePelicula() + " presenta la siguiente informacion\n" +
            estadoPelicula);
            return;
        } else {
            if (nombrePelicula.equals(pelicula2.getNombrePelicula())) {
                pelicula2.setDisponible(true);
                pelicula2.setEstadoPelicula(estadoPelicula);
                System.out.println("Usted a ingresado la siguiente informacion\n" +
                "La pelicula " + pelicula2.getNombrePelicula() + " presenta la siguiente informacion\n" +
                estadoPelicula);
                return;
            } else {
                if (nombrePelicula.equals(pelicula3.getNombrePelicula())) {
                    pelicula3.setDisponible(true);
                    pelicula3.setEstadoPelicula(estadoPelicula);
                    System.out.println("Usted a ingresado la siguiente informacion\n" +
                    "La pelicula " + pelicula3.getNombrePelicula() + " presenta la siguiente informacion\n" +
                    estadoPelicula);
                    return;
                } else {
                    if (nombrePelicula.equals(pelicula4.getNombrePelicula())) {
                        pelicula4.setDisponible(true);
                        pelicula4.setEstadoPelicula(estadoPelicula);
                        System.out.println("Usted a ingresado la siguiente informacion\n" +
                        "La pelicula " + pelicula4.getNombrePelicula() + " presenta la siguiente informacion\n" +
                        estadoPelicula);
                        return;
                    } else {
                        System.out.println("La pelicula ingresada no es valida");
                        return;
                    }
                }
            }
        }
    }

    private static String nombrePelicula, estadoPelicula;
    private static int opcion, opcionPelicula;
    private static boolean control = true;

    static pelicula pelicula1 = new pelicula("Volver al futuro", "Bien", true);
    static pelicula pelicula2 = new pelicula("Blade Runner 2049", "Bien", true);
    static pelicula pelicula3 = new pelicula("Ghost in the Shell", "Bien", true);
    static pelicula pelicula4 = new pelicula("Akira", "Bien", true);

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (control == true) {
                System.out.println("Elija la opcion deseada\n" + "1. Alquilar pelicula\n" +
                "2. Consultar peliculas disponibles\n" + "3. Recibir pelicula\n" +
                "0. Salir");

                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Elija la pelicula deseada\n" + "1. Volver al futuro\n"
                        + "2. Blade Runner 2049\n" + "3. Ghost in the Shell\n" + "4. Akira\n");

                        opcionPelicula = input.nextInt();

                        switch (opcionPelicula) {
                            case 1:
                                alquilarPelicula(pelicula1.getNombrePelicula(), pelicula1.isDisponible(), opcionPelicula);
                                break;
                            case 2:
                                alquilarPelicula(pelicula2.getNombrePelicula(), pelicula2.isDisponible(), opcionPelicula);
                                break;
                            case 3:
                                alquilarPelicula(pelicula3.getNombrePelicula(), pelicula3.isDisponible(), opcionPelicula);
                                break;
                            case 4:
                            alquilarPelicula(pelicula4.getNombrePelicula(), pelicula4.isDisponible(), opcionPelicula);
                                break;
                            default:
                                System.out.println("La pelicula elejida no existe");
                                break;
                        }
                        break;
                    case 2:
                        consultarPelicula();
                        break;
                    case 3:
                        System.out.println("Ingrese el nombre de la pelicula a regresar");
                        nombrePelicula = input.next();

                        System.out.println("¿La pelicula presenta algun daño o noverdad? Por favor ingresa la informacion pertinente");
                        estadoPelicula = input.next();

                        recibirPelicula(nombrePelicula, estadoPelicula);
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
}
