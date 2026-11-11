package Taller19.Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando '" + usuario + "' a través de proveedor OAuth...");
        return true;
    }
}
