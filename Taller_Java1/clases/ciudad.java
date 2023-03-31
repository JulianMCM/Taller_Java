package clases;

public class ciudad {
    
    private String ciudadCapital, pais;

    public ciudad(String ciudadCapital, String pais) {
        this.ciudadCapital = ciudadCapital;
        this.pais = pais;
    }

    public String getCiudadCapital() {
        return ciudadCapital;
    }

    public void setCiudadCapital(String ciudadCapital) {
        this.ciudadCapital = ciudadCapital;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
}
