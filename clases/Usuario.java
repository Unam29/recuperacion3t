package clases;

public class Usuario {

    public String nombre;
    public String email;
    private String contraseña;

    public Usuario () {}
    public Usuario (String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public void login(String nombre, String email, String contraseña){}

    public void venderProducto(){}
}