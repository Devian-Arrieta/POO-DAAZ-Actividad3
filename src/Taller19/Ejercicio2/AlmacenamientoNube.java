package Taller19.Ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Subiendo '" + nombreArchivo + "' al servidor en la nube");
    }

    @Override
    public String recuperar(String nombreArchivo) {
        return "Contenido descargado desde la nube de " + nombreArchivo;
    }
}
