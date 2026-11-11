package Taller19.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando '" + usuario + "' mediante base de datos local...");
        return "admin".equals(usuario) && "1234".equals(contrasena);
    }
}
