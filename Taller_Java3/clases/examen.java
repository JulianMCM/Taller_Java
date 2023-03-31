package clases;

public class examen {
    private boolean aprovado, presentado;
    private String usuario;
    public examen(boolean aprovado, boolean presentado, String usuario) {
        this.aprovado = aprovado;
        this.presentado = presentado;
        this.usuario = usuario;
    }
    public boolean isAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    public boolean isPresentado() {
        return presentado;
    }
    public void setPresentado(boolean presentado) {
        this.presentado = presentado;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
