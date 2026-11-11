package Taller19.Ejercicio3;

public class ReporteExcel implements GeneradorReporte {

    @Override
    public void generar(String titulo, String contenido) {
        System.out.println("Exportando reporte en hoja de cálculo Excel: [" + titulo + ".xlsx]");
    }
}
