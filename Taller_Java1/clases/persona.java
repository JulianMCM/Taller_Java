package clases;

/**
 * Persona
 */
public class persona {

    private String nombre, apellido, nombrePadre, apellidoPadre, nombreMadre, apellidoMadre;
    private int edad;
    private double estatura;

    public persona(String nombre, String apellido, String nombrePadre, String apellidoPadre, String nombreMadre,
            String apellidoMadre, int edad, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.nombreMadre = nombreMadre;
        this.apellidoMadre = apellidoMadre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getApellidoMadre() {
        return apellidoMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        this.apellidoMadre = apellidoMadre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }



}