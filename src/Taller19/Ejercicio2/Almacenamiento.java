package Taller19.Ejercicio2;

public interface Almacenamiento {

    void guardar(String nombreArchivo, String contenido);
    String recuperar(String nombreArchivo);
}
