import Taller19.Ejercicio3.GeneradorReporte;
import Taller19.Ejercicio3.GestorReportes;
import Taller19.Ejercicio3.ReporteExcel;
import Taller19.Ejercicio3.ReportePDF;

void main() {

    GeneradorReporte pdf = new ReportePDF();
    GestorReportes gestorPDF = new GestorReportes(pdf);

    GeneradorReporte excel = new ReporteExcel();
    GestorReportes gestorExcel = new GestorReportes(excel);
    
    gestorPDF.crearReporteMensual("Balance_Financiero_2026", "Ingresos: $120,000 | Egresos: $45,000");
    gestorExcel.crearReporteMensual("Nomina_Empleados_Q4", "Total empleados procesados: 85");
}