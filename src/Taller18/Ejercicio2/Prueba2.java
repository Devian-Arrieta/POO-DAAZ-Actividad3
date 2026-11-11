import Taller18.Ejercicio2.AppBancaria;
import Taller18.Ejercicio2.Cajero;
import Taller18.Ejercicio2.ConcesionarioBanco;

void main() {

    AppBancaria app = new AppBancaria();
    Cajero cajero = new Cajero();
    ConcesionarioBanco concesionarioBanco = new ConcesionarioBanco();


    app.pagarFactura(50000, 765396);
    app.transferir(100000, "0123-4567-8910");

    cajero.retirar(200000);
    
    concesionarioBanco.pagarFactura(500000, 924752);
}