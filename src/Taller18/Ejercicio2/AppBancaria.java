package Taller18.Ejercicio2;

public class AppBancaria implements Transferencia, PagoFactura {

    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("la app está transfiriendo $" + monto + " a la cuenta " + cuentaDestino);
    }

    @Override
    public void pagarFactura(double monto, int codigoFactura) {
        System.out.println("la app a pagando factura #" + codigoFactura + " por $" + monto);
    }
}
