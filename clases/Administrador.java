package clases;


public class Administrador extends Usuario{
   
    public String permisos;

    public Administrador () {}
    public Administrador (String nombre, String email, String contraseña,String permisos) {
        super(nombre, email, contraseña);
        this.nombre = nombre;
    
    }

    public void concederPermisos(String nombre, String email, String contraseña){}

    public void veliminarPermisos(String nombre, String email, String contraseña){}

}