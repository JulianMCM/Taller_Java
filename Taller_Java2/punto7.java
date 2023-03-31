import java.util.Scanner;

import clases.pasiente;

public class punto7 {

    static void calcularIMC(Double peso, Double estatura){
        double imc;
        System.out.println("Ahora se procedera a calcular el IMC del paciente...");
        imc = pasiente1.getPeso()/(pasiente1.getEstatura()*pasiente1.getEstatura());
        pasiente1.setImc(imc);

        System.out.println("El ciudadano " + pasiente1.getNombre() + " " + pasiente1.getApellido() + "\n" + 
        " con cedula " + pasiente1.getCedula() + "\n" + " con peso " + pasiente1.getPeso() + "\n" + 
        " y una esatura de " + pasiente1.getEstatura() + "\n");

        if (imc < 18.5) {
            System.out.println("Tiene un indice de masa corporal de: " +  pasiente1.getImc() + " y actualmente tiene bajo peso");
        } else {
            if (imc >= 18.5 & imc <= 24.9) {
                System.out.println("Tiene un indice de masa corporal de: " +  pasiente1.getImc() + " y actualmente tiene un peso normal");
            } else {
                if (imc >= 25 & imc <= 29.9) {
                    System.out.println("Tiene un indice de masa corporal de: " +  pasiente1.getImc() + " y actualmente tiene sobrepeso");
                } else {
                    if (imc > 30) {
                        System.out.println("Tiene un indice de masa corporal de: " +  pasiente1.getImc() + " y actualmente tiene obesidad");
                    }
                }
            }
        }
    }

    private static double peso, estatura;
    private static String nombre, apellido, cedula;
    static Scanner input = new Scanner(System.in);
    static pasiente pasiente1 = new pasiente(0, 0, 0, "", "", "");

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema :) \n" + "Por favor ingrese los datos del paciente \n"
        + "Nombres: ");
        nombre = input.next();
        System.out.println("Apellidos: ");
        apellido = input.next();
        System.out.println("Cedula: ");
        cedula = input.next();
        System.out.println("Peso en kilogramos: ");
        peso = input.nextDouble();
        System.out.println("Estatura en metros: ");
        estatura = input.nextDouble();
        pasiente1.setNombre(nombre);
        pasiente1.setApellido(apellido);
        pasiente1.setEstatura(estatura);
        pasiente1.setPeso(peso);
        pasiente1.setCedula(cedula);

        calcularIMC(pasiente1.getPeso(), pasiente1.getEstatura());

    }
}
