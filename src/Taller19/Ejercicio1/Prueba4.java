import Taller19.Ejercicio1.AutenticacionLocal;
import Taller19.Ejercicio1.AutenticacionOAuth;
import Taller19.Ejercicio1.GestorAutenticacion;
import Taller19.Ejercicio1.ServicioAutenticacion;

void main() {
    ServicioAutenticacion authLocal = new AutenticacionLocal();
    GestorAutenticacion gestorLocal = new GestorAutenticacion(authLocal);

    ServicioAutenticacion authOAuth = new AutenticacionOAuth();
    GestorAutenticacion gestorOAuth = new GestorAutenticacion(authOAuth);


    gestorLocal.iniciarSesion("admin", "1234");
    gestorLocal.iniciarSesion("admin", "clave_incorrecta");

    gestorOAuth.iniciarSesion("usuario_google", "token_oauth_xyz");
}