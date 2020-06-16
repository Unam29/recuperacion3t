package clases;

public class Tienda {

    public String nombre;
    public String direccion;
    public String ofertas;

    public Tienda () {}
    public Tienda (String nombre, String direccion, String ofertas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ofertas = ofertas;
    }

    public void publicarOferta(String ofertas) {
    }

    public void comprarProducto(){}
}