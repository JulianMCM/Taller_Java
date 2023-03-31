package clases;

public class torta {
    private String nombreTorta, sabor, decoracion;
    private int porciones, nventas;
    
    public torta(String nombreTorta, String sabor, String decoracion, int porciones, int nventas) {
        this.nombreTorta = nombreTorta;
        this.sabor = sabor;
        this.decoracion = decoracion;
        this.porciones = porciones;
        this.nventas = nventas;
    }

    public String getNombreTorta() {
        return nombreTorta;
    }

    public void setNombreTorta(String nombreTorta) {
        this.nombreTorta = nombreTorta;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public int getNventas() {
        return nventas;
    }

    public void setNventas(int nventas) {
        this.nventas = nventas;
    } 
}
