package clases;

public class mascota {
    private String nombreMascota, nombreDueno, tipoMascota;
    private int edadMascota;
    public mascota(String nombreMascota, String nombreDueno, String tipoMascota, int edadMascota) {
        this.nombreMascota = nombreMascota;
        this.nombreDueno = nombreDueno;
        this.tipoMascota = tipoMascota;
        this.edadMascota = edadMascota;
    }
    public String getNombreMascota() {
        return nombreMascota;
    }
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public String getNombreDueno() {
        return nombreDueno;
    }
    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }
    public String getTipoMascota() {
        return tipoMascota;
    }
    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }
    public int getEdadMascota() {
        return edadMascota;
    }
    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    } 
}
