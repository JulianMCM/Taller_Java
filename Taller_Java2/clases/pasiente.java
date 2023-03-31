package clases;

public class pasiente {
    private double peso, estatura, imc;
    private String nombre, apellido, cedula;
    public pasiente(double peso, double estatura, double imc, String nombre, String apellido, String cedula) {
        this.peso = peso;
        this.estatura = estatura;
        this.imc = imc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
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
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
