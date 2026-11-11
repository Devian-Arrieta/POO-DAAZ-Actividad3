package Taller19.Ejercicio1;

public class GestorAutenticacion {

    private final ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String contrasena) {
        if (servicio.autenticar(usuario, contrasena)) {
            System.out.println("Acceso concedido a " + usuario);
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }
}
