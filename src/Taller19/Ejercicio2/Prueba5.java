import Taller19.Ejercicio2.Almacenamiento;
import Taller19.Ejercicio2.AlmacenamientoLocal;
import Taller19.Ejercicio2.AlmacenamientoNube;
import Taller19.Ejercicio2.GestorArchivos;

void main() {

    Almacenamiento local = new AlmacenamientoLocal();
    GestorArchivos gestorLocal = new GestorArchivos(local);

    Almacenamiento nube = new AlmacenamientoNube();
    GestorArchivos gestorNube = new GestorArchivos(nube);


    gestorLocal.procesarGuardado("config.json", "{ 'theme': 'dark' }");
    gestorLocal.procesarLectura("config.json");

    gestorNube.procesarGuardado("respaldo_base_datos.sql", "CREATE TABLE...");
    gestorNube.procesarLectura("respaldo_base_datos.sql");
}