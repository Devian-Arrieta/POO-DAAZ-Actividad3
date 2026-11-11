package Taller18.Ejercicio2;

public class ConcesionarioBanco implements PagoFactura {

    @Override
    public void pagarFactura(double monto, int codigoFactura) {
        System.out.println("Ventanilla de Servicios: Pagando factura #" + codigoFactura + " por $" + monto);
    }
}
