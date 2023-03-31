import java.util.Scanner;

import clases.contacto;

public class punto6 {

    static int añadirContacto(int i, String nombre, String telefono, String organizacion){
        int numContac = 0;
        if (telefono.equals(contacto1.getTelefono()) | telefono.equals(contacto2.getTelefono()) | telefono.equals(contacto3.getTelefono())) {
            System.out.println("El numero ingresado ya existe");
            numContac = 1-i;
            return numContac;
        } else {
            if (contacto1.getNombre().equals("")) {
                contacto1.setNombre(nombre);
                contacto1.setTelefono(telefono);
                contacto1.setOrganizacion(organizacion);
                numContac = 1+i;
                return numContac;
            } else {
                if (contacto2.getNombre().equals("")) {
                    contacto2.setNombre(nombre);
                    contacto2.setTelefono(telefono);
                    contacto2.setOrganizacion(organizacion);
                    numContac = 1+i;
                    return numContac;
                } else {
                    if (contacto3.getNombre().equals("")) {
                        contacto3.setNombre(nombre);
                        contacto3.setTelefono(telefono);
                        contacto3.setOrganizacion(organizacion);
                        numContac = 1+i;
                        return numContac;
                    } else {
                        System.out.println("Ya no se puede agregar mas contactos");
                    }
                }
            }
        }
        return numContac;
    }

    static void buscarContacto(String nombre){
        if (nombre.equals(contacto1.getNombre())) {
            System.out.println(contacto1.getNombre() + " " + contacto1.getTelefono() + " " + contacto1.getOrganizacion());
            return;
        } else {
            if (nombre.equals(contacto2.getNombre())) {
                System.out.println(contacto2.getNombre() + " " + contacto2.getTelefono() + " " + contacto2.getOrganizacion());
                return;
            } else {
                if (nombre.equals(contacto3.getNombre())) {
                    System.out.println(contacto3.getNombre() + " " + contacto3.getTelefono() + " " + contacto3.getOrganizacion());
                    return;
                } else {
                    System.out.println("El contacto no existe");
                    return;
                }
            }
        }
    }

    static int eliminarContacto(int i, String telefono){
        int numContac = 0;
        if (telefono.equals(contacto1.getTelefono())) {
            contacto1.setNombre("");
            contacto1.setOrganizacion("");
            contacto1.setTelefono("");
            numContac = 1-i;
            return numContac;
        } else {
            if (telefono.equals(contacto2.getTelefono())) {
                contacto2.setNombre("");
                contacto2.setOrganizacion("");
                contacto2.setTelefono("");
                numContac = 1-i;
                return numContac;
            } else {
                if (telefono.equals(contacto3.getTelefono())) {
                    contacto3.setNombre("");
                    contacto3.setOrganizacion("");
                    contacto3.setTelefono("");
                    numContac = 1-i;
                    return numContac;
                } else {
                    System.out.println("El numero ingresado no existe");
                    return numContac;
                }
            }
        }
    }

    private static boolean control = true;
    private static int i = 0, opcion;
    private static String nombre, telefono, organizacion;
    static Scanner input = new Scanner(System.in);

    static contacto contacto1 = new contacto("", "", "");
    static contacto contacto2 = new contacto("", "", "");
    static contacto contacto3 = new contacto("", "", "");
    
    public static void main(String[] args) {
        
        while (control == true) {
            System.out.println("Bienvenido a sus contactos\n" + "1. Añadir contacto\n" +
            "2. Buscar contacto\n" + "3. Eliminar contacto\n" + "0. Salir\n");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    if (i >= 3) {
                        System.out.println("Ya no se pueden agregar mas contactos\n");
                    } else {
                        System.out.println("Nombre contacto: ");
                        nombre = input.next();
                        System.out.println("Telefono: ");
                        telefono = input.next();
                        System.out.println("Organizacion: ");
                        organizacion = input.next();
                        i = añadirContacto(i, nombre, telefono, organizacion);
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del contacto que desea buscar: ");
                    nombre = input.next();
                    buscarContacto(nombre);
                    break;

                case 3:
                    System.out.println("Ingrese el numero de telefono que desea eliminar");
                    telefono = input.next();
                    i = eliminarContacto(i, telefono);
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
