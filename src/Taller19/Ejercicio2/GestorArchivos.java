package Taller19.Ejercicio2;

public class GestorArchivos {

    private final Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarGuardado(String nombre, String contenido) {
        almacenamiento.guardar(nombre, contenido);
    }

    public void procesarLectura(String nombre) {
        String data = almacenamiento.recuperar(nombre);
        System.out.println("Lectura exitosa: " + data);
    }
}
