package clases;

public class motocicleta {
    private String placa, modelo, arreglos, ingreso, salida, observaciones, novedades;

    public motocicleta(String placa, String modelo, String arreglos, String ingreso, String salida,
            String observaciones, String novedades) {
        this.placa = placa;
        this.modelo = modelo;
        this.arreglos = arreglos;
        this.ingreso = ingreso;
        this.salida = salida;
        this.observaciones = observaciones;
        this.novedades = novedades;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getArreglos() {
        return arreglos;
    }

    public void setArreglos(String arreglos) {
        this.arreglos = arreglos;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNovedades() {
        return novedades;
    }

    public void setNovedades(String novedades) {
        this.novedades = novedades;
    }
    
}
