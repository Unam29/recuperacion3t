package clases;


public class Catalogo {

    public String tipo;
    public int precio;
    public String oferta;

    public Catalogo () {}
    public Catalogo (String tipo, int precio, String oferta) {
        this.tipo = tipo;
        this.precio = precio;
        this.oferta = oferta;
    }

    public void mostrarOferta(String oferta) {
    }

    public void recomendarOferta(){}
}