package clases;

public class pelicula {
    private String nombrePelicula, estadoPelicula;
    private boolean disponible;

    public pelicula(String nombrePelicula, String estadoPelicula, boolean disponible) {
        this.nombrePelicula = nombrePelicula;
        this.estadoPelicula = estadoPelicula;
        this.disponible = disponible;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getEstadoPelicula() {
        return estadoPelicula;
    }

    public void setEstadoPelicula(String estadoPelicula) {
        this.estadoPelicula = estadoPelicula;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
      
}
