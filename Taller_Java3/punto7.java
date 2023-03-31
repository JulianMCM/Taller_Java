import java.util.Scanner;

import clases.vehiculo;

public class punto7 {

    static boolean ingresarVehiculo(boolean confirma, String placa, String marca, String telefono, String nombre){
        boolean con = false;
        if (placa.equals(vehiculo1.getPlaca()) | placa.equals(vehiculo2.getPlaca()) | placa.equals(vehiculo3.getPlaca()) | placa.equals(vehiculo4.getPlaca()) | placa.equals(vehiculo5.getPlaca())) {
            System.out.println("El vehiculo ingresado ya existe");
            con = false;
            return con;
        } else {
            if (vehiculo1.getPlaca().equals("")) {
                vehiculo1.setPlaca(placa);
                vehiculo1.setMarca(marca);
                vehiculo1.setTelefono(telefono);
                vehiculo1.setNombre(nombre);
                System.out.print("Se ha añadido el vehiculo correctamente\n" + "Placa: " + placa + "\n" +
                "Marca: " + marca + "\n" + "Telefono: " + telefono + "\n" + "Nombre: " + nombre + "\n");
                con = true;
                return con;
            } else {
                if (vehiculo2.getPlaca().equals("")) {
                    vehiculo2.setPlaca(placa);
                    vehiculo2.setMarca(marca);
                    vehiculo2.setTelefono(telefono);
                    vehiculo2.setNombre(nombre);
                    System.out.print("Se ha añadido el vehiculo correctamente\n" + "Placa: " + placa + "\n" +
                    "Marca: " + marca + "\n" + "Telefono: " + telefono + "\n" + "Nombre: " + nombre + "\n");
                    con = true;
                    return con;
                } else {
                    if (vehiculo3.getPlaca().equals("")) {
                        vehiculo3.setPlaca(placa);
                        vehiculo3.setMarca(marca);
                        vehiculo3.setTelefono(telefono);
                        vehiculo3.setNombre(nombre);
                        System.out.print("Se ha añadido el vehiculo correctamente\n" + "Placa: " + placa + "\n" +
                        "Marca: " + marca + "\n" + "Telefono: " + telefono + "\n" + "Nombre: " + nombre + "\n");
                        con = true;
                        return con;
                    } else {
                        if (vehiculo4.getPlaca().equals("")) {
                            vehiculo4.setPlaca(placa);
                            vehiculo4.setMarca(marca);
                            vehiculo4.setTelefono(telefono);
                            vehiculo4.setNombre(nombre);
                            System.out.print("Se ha añadido el vehiculo correctamente\n" + "Placa: " + placa + "\n" +
                            "Marca: " + marca + "\n" + "Telefono: " + telefono + "\n" + "Nombre: " + nombre + "\n");
                            con = true;
                            return con;
                        } else {
                            if (vehiculo5.getPlaca().equals("")) {
                                vehiculo5.setPlaca(placa);
                                vehiculo5.setMarca(marca);
                                vehiculo5.setTelefono(telefono);
                                vehiculo5.setNombre(nombre);
                                System.out.print("Se ha añadido el vehiculo correctamente\n" + "Placa: " + placa + "\n" +
                                "Marca: " + marca + "\n" + "Telefono: " + telefono + "\n" + "Nombre: " + nombre + "\n");
                                con = true;
                                return con;
                            } else {
                                System.out.println("No se pueden ingresar mas vehiculos");
                                con = false;
                                return con;
                            }
                        }
                    }
                }
            }
        }
    }

    static boolean retirarVehiculo(Boolean confirma, String placa){
        boolean con = false;
        if (placa.equals(vehiculo1.getPlaca())) {
            System.out.print("Se ha eliminado el vehiculo correctamente\n" + "Placa: " + vehiculo1.getPlaca() + "\n" +
            "Marca: " + vehiculo1.getMarca() + "\n" + "Telefono: " + vehiculo1.getTelefono() + "\n" + "Nombre: " + vehiculo1.getNombre() + "\n");
            vehiculo1.setPlaca("");
            vehiculo1.setMarca("");
            vehiculo1.setTelefono("");
            vehiculo1.setNombre("");
            con = true;
            return con;
        } else {
            if (placa.equals(vehiculo2.getPlaca())) {
                System.out.print("Se ha eliminado el vehiculo correctamente\n" + "Placa: " + vehiculo2.getPlaca() + "\n" +
                "Marca: " + vehiculo2.getMarca() + "\n" + "Telefono: " + vehiculo2.getTelefono() + "\n" + "Nombre: " + vehiculo2.getNombre() + "\n");
                vehiculo2.setPlaca("");
                vehiculo2.setMarca("");
                vehiculo2.setTelefono("");
                vehiculo2.setNombre("");
                con = true;
                return con;
            } else {
                if (placa.equals(vehiculo3.getPlaca())) {
                    System.out.print("Se ha eliminado el vehiculo correctamente\n" + "Placa: " + vehiculo3.getPlaca() + "\n" +
                    "Marca: " + vehiculo3.getMarca() + "\n" + "Telefono: " + vehiculo3.getTelefono() + "\n" + "Nombre: " + vehiculo3.getNombre() + "\n");
                    vehiculo3.setPlaca("");
                    vehiculo3.setMarca("");
                    vehiculo3.setTelefono("");
                    vehiculo3.setNombre("");
                    con = true;
                    return con;
                } else {
                    if (placa.equals(vehiculo4.getPlaca())) {
                        System.out.print("Se ha eliminado el vehiculo correctamente\n" + "Placa: " + vehiculo4.getPlaca() + "\n" +
                        "Marca: " + vehiculo4.getMarca() + "\n" + "Telefono: " + vehiculo4.getTelefono() + "\n" + "Nombre: " + vehiculo4.getNombre() + "\n");
                        vehiculo4.setPlaca("");
                        vehiculo4.setMarca("");
                        vehiculo4.setTelefono("");
                        vehiculo4.setNombre("");
                        con = true;
                        return con;
                    } else {
                        if (placa.equals(vehiculo5.getPlaca())) {
                            System.out.print("Se ha eliminado el vehiculo correctamente\n" + "Placa: " + vehiculo5.getPlaca() + "\n" +
                            "Marca: " + vehiculo5.getMarca() + "\n" + "Telefono: " + vehiculo5.getTelefono() + "\n" + "Nombre: " + vehiculo5.getNombre() + "\n");
                            vehiculo5.setPlaca("");
                            vehiculo5.setMarca("");
                            vehiculo5.setTelefono("");
                            vehiculo5.setNombre("");
                            con = true;
                            return con;
                        } else {
                            System.out.println("El vehiculo no existe");
                            con = false;
                            return con;
                        }
                    }
                }
            }
        }
    }

    static void buscarVehiculo(String placa){
        if (placa.equals(vehiculo1.getPlaca())) {
            System.out.print("El vehiculo tiene la siguiente informacion\n" + "Placa: " + vehiculo1.getPlaca() + "\n" +
            "Marca: " + vehiculo1.getMarca() + "\n" + "Telefono: " + vehiculo1.getTelefono() + "\n" + "Nombre: " + vehiculo1.getNombre() + "\n");
            return;
        } else {
            if (placa.equals(vehiculo2.getPlaca())) {
                System.out.print("El vehiculo tiene la siguiente informacion\n" + "Placa: " + vehiculo2.getPlaca() + "\n" +
                "Marca: " + vehiculo2.getMarca() + "\n" + "Telefono: " + vehiculo2.getTelefono() + "\n" + "Nombre: " + vehiculo2.getNombre() + "\n");
                return;
            } else {
                if (placa.equals(vehiculo3.getPlaca())) {
                    System.out.print("El vehiculo tiene la siguiente informacion\n" + "Placa: " + vehiculo3.getPlaca() + "\n" +
                    "Marca: " + vehiculo3.getMarca() + "\n" + "Telefono: " + vehiculo3.getTelefono() + "\n" + "Nombre: " + vehiculo3.getNombre() + "\n");
                    return;
                } else {
                    if (placa.equals(vehiculo4.getPlaca())) {
                        System.out.print("El vehiculo tiene la siguiente informacion\n" + "Placa: " + vehiculo4.getPlaca() + "\n" +
                        "Marca: " + vehiculo4.getMarca() + "\n" + "Telefono: " + vehiculo4.getTelefono() + "\n" + "Nombre: " + vehiculo4.getNombre() + "\n");
                        return;
                    } else {
                        if (placa.equals(vehiculo5.getPlaca())) {
                            System.out.print("El vehiculo tiene la siguiente informacion\n" + "Placa: " + vehiculo5.getPlaca() + "\n" +
                            "Marca: " + vehiculo5.getMarca() + "\n" + "Telefono: " + vehiculo5.getTelefono() + "\n" + "Nombre: " + vehiculo5.getNombre() + "\n");
                            return;
                        } else {
                            System.out.println("El vehiculo no se encuentra registrado");
                            return;
                        }
                    }
                }
            }
        }
    }

    private static String placa, marca, telefono, nombre;
    private static int opcion, i=0;
    private static boolean control = true, confirma;
    static Scanner input = new Scanner(System.in);

    static vehiculo vehiculo1 = new vehiculo("", "", "", "");
    static vehiculo vehiculo2 = new vehiculo("", "", "", "");
    static vehiculo vehiculo3 = new vehiculo("", "", "", "");
    static vehiculo vehiculo4 = new vehiculo("", "", "", "");
    static vehiculo vehiculo5 = new vehiculo("", "", "", "");

    public static void main(String[] args) {
        
        while (control == true) {
            System.out.println("Bienvenido al parqueadero El guardian\n" + "1. Ingresar vehiculo\n" +
            "2. Retirar vehiculo\n" + "3. Consultar vehiculo\n" + "0. Salir\n");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    if (i >= 5) {
                        System.out.println("Ya no se pueden ingresar mas vehiculos");
                    } else {
                        System.out.println("Por favor ingrese los siguiente datos: \n" +
                        "Numero de placa: \n");
                        placa = input.next();
                        System.out.println("Marca del vehiculo: \n");
                        marca = input.next();
                        System.out.println("Nombre del propietario: \n");
                        nombre = input.next();
                        System.out.println("telefono del propietario: \n");
                        telefono = input.next();
                        confirma = ingresarVehiculo(confirma, placa, marca, telefono, nombre);
                        if (confirma == true) {
                            i = i + 1;
                            confirma = false;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la placa del vehiculo que desea retirar: \n");
                    placa = input.next();
                    confirma = retirarVehiculo(confirma, placa);
                    if (confirma == true) {
                        i = i - 1;
                        confirma = false;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la placa del vehiculo que desea consultar: \n");
                    placa = input.next();
                    buscarVehiculo(placa);
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    control = false;
                    break;
            
                default:
                    System.out.println("La opcion elegida no existe");
                    break;
            }
        }
    }
}
