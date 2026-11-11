package Taller18.Ejercicio2;

public interface OperacionesBancarias {

    void transferir(double monto, String cuentaDestino);
    void retirar(double monto);
    void pagarFactura(double monto, int codigoFactura);
}
