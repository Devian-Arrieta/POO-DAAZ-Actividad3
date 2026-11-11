package Taller19.Ejercicio3;

public class GestorReportes {

    private final GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporteMensual(String titulo, String datos) {
        generador.generar(titulo, datos);
    }
}
