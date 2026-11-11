import Taller18.Ejercicio3.Auto;
import Taller18.Ejercicio3.Volqueta;

void main() {

    Auto auto = new Auto();
    Volqueta volqueta = new Volqueta();
    
    auto.conducir();
    volqueta.conducir();
    volqueta.cargarMercancia(400);
}