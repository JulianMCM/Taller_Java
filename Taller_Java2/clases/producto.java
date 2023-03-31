package clases;

public class producto {
    private String caracteProducto, producto;
    private double precio;
    private int stock;
    
    public producto(String caracteProducto, String producto, double precio, int stock) {
        this.caracteProducto = caracteProducto;
        this.producto = producto;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCaracteProducto() {
        return caracteProducto;
    }

    public void setCaracteProducto(String caracteProducto) {
        this.caracteProducto = caracteProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    } 
}
