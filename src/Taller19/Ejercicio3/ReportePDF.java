package Taller19.Ejercicio3;

public class ReportePDF implements GeneradorReporte {

    @Override
    public void generar(String titulo, String contenido) {
        System.out.println("Exportando reporte en formato PDF: [" + titulo + ".pdf]");
    }
}
