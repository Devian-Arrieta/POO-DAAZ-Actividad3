package Taller19.Ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {

    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Guardando '" + nombreArchivo + "' en el disco duro local.");
    }

    @Override
    public String recuperar(String nombreArchivo) {
        return "Contenido local de " + nombreArchivo;
    }
}
