import java.util.Scanner;
import clases.producto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class punto5 {

    static double comprarProducto(int listaProductos, int carrito, double total, List<String> lista1){
        int i;
        if (listaProductos == 1 & producto1.getStock() >= 1) {
            System.out.println("Se a añadido " + producto1.getProducto() + "a la lista de compra");
            i = producto1.getStock();
            producto1.setStock(i-1);
            carrito = carrito + 1;
            total = total + producto1.getPrecio();
            lista1.add(producto1.getProducto().concat(" precio " + String.valueOf(producto1.getPrecio())).concat(" total: " + total));
            System.out.println("Esta es la lista de compra: \n"
            + lista1);
            lista1.removeAll(lista1);
            return total;
        } else {
            if (listaProductos == 2 & producto2.getStock() >= 1) {
                System.out.println("Se a añadido " + producto2.getProducto() + "a la lista de compra");
                i = producto2.getStock();
                producto2.setStock(i-1);
                carrito = carrito + 1;
                total = total + producto2.getPrecio();
                lista1.add(producto2.getProducto().concat(" precio " + String.valueOf(producto2.getPrecio())).concat(" total: " + total));
                System.out.println("Esta es la lista de compra: \n"
                + lista1);
                lista1.removeAll(lista1);
                return total;
            } else {
                if (listaProductos == 3 & producto3.getStock() >= 1) {
                    System.out.println("Se a añadido " + producto3.getProducto() + "a la lista de compra");
                    i = producto3.getStock();
                    producto3.setStock(i-1);
                    carrito = carrito + 1;
                    total = total + producto3.getPrecio();
                    lista1.add(producto3.getProducto().concat(" precio " + String.valueOf(producto3.getPrecio())).concat(" total: " + total));
                    System.out.println("Esta es la lista de compra: \n"
                    + lista1);
                    lista1.removeAll(lista1);
                    return total;
                } else {
                    System.out.println("No hay existencias de ningun producto");
                    return total;
                }
            }
        }
    }

    static void consultarProct(){
        List<String> lista = new ArrayList<>();
        double [] precios = {producto1.getPrecio(), producto2.getPrecio(), producto3.getPrecio()};
        //double aux;
        boolean verificacion = true;
        
        Arrays.sort(precios);
        int i = 0;
        while (verificacion == true) {
            
            if (producto1.getStock() >=1 & producto1.getPrecio() == precios[i]) {
                lista.add(String.valueOf(producto1.getPrecio()));
                lista.add(producto1.getProducto());
                i ++;
            } else {
                if (producto2.getStock() >= 1 & producto2.getPrecio() == precios[i]) {
                    lista.add(String.valueOf(producto2.getPrecio()));
                    lista.add(producto2.getProducto());
                    i ++;
                } else {
                    if (producto3.getStock() >= 1 & producto3.getPrecio() == precios[i]) {
                        lista.add(String.valueOf(producto3.getPrecio()));
                        lista.add(producto3.getProducto());
                        i ++;
                    }
                }
            }
            if (i >= 3) {
                verificacion = false;
            }
        }
        System.out.println("Esta es una lista de los productos ordenados por precio: \n"
        + lista);
        return;
    }

    static double recibirProducto(String producto, int carrito, double total, List<String> lista1){
        if (producto.equals(producto1.getProducto())) {
            lista1.removeAll(lista1);
            producto1.setStock(1);
            total = total - producto1.getPrecio();
            System.out.println("Se a regresado el producto " + producto1.getProducto());
            return total;
        } else {
            if (producto.equals(producto2.getProducto())) {
                lista1.removeAll(lista1);
                producto2.setStock(1);
                total = total - producto2.getPrecio();
                System.out.println("Se a regresado el producto " + producto2.getProducto());
                return total;
            } else {
                if (producto.equals(producto3.getProducto())) {
                    lista1.removeAll(lista1);
                    producto3.setStock(1);
                    total = total - producto3.getPrecio();
                    System.out.println("Se a regresado el producto " + producto3.getProducto());
                    return total;
                } else {
                    System.out.println("El producto ingresado no es valido");
                    return total;
                }
            }
        }
    }
    
    private static String producto;
    private static int listaProductos, opcion, carrito = 0;
    private static boolean control = true, compra = true;
    private static double total = 0;

    static List<String> lista1 = new ArrayList<>();

    static producto producto1 = new producto("Alivian, reducen el dolor", "Analgesicos", 5999.99, 2);
    static producto producto2 = new producto("Vendar heridas", "Vendas", 3560.80, 1);
    static producto producto3 = new producto("Equipamento basico", "Botiquin", 10999.89, 3);

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (control == true) {
                System.out.println("Elija la opcion deseada\n" + "1. Comprar productos\n" +
                "2. Consultar productos por precio\n" + "3. Devolver producto\n" +
                "0. Salir");

                compra = true;
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                    while (compra == true) {

                        System.out.println("Seleccione los productos que desea comprar\n" + "1. " + producto1.getProducto() + "\n"
                        + "2. " + producto2.getProducto() + "\n" + "3. " + producto3.getProducto() + "\n" + "4. Dejar de comprar\n");

                        listaProductos = input.nextInt();

                        switch (listaProductos) {
                            case 1:
                                if (producto1.getStock() <= 0) {
                                    System.out.println("Ya no quedan existencias de este producto");
                                } else {
                                    total = comprarProducto(listaProductos, carrito, total, lista1);
                                    carrito = carrito + 1;
                                }
                                break;

                            case 2:
                                if (producto2.getStock() <= 0) {
                                    System.out.println("Ya no quedan existencias de este producto");
                                } else {
                                    total =  comprarProducto(listaProductos, carrito, total, lista1);
                                    carrito = carrito + 1;
                                }
                                break;

                            case 3:
                                if (producto3.getStock() <= 0) {
                                    System.out.println("Ya no quedan existencias de este producto");
                                } else {
                                    total =  comprarProducto(listaProductos, carrito, total, lista1);
                                    carrito = carrito + 1;
                                }
                                break;

                            case 4:
                                System.out.println("Dejando de comprar...");
                                compra = false;
                                break;

                            default:
                            break;
                        }
                    }
                        break;

                    case 2:
                        consultarProct();
                        break;

                    case 3:
                        if (carrito == 0) {
                            System.out.println("No hay articulos que regresar");
                        } else {
                            System.out.println("Ingrese el nombre del producto que desea regresar");
                            producto = input.next();
                            total = recibirProducto(producto, carrito, total, lista1);
                        }
                        break;

                    case 0:
                        control = false;
                        break;
                
                    default:
                        break;
                }
            }
        }
    }
}
