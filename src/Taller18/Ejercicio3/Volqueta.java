package Taller18.Ejercicio3;

public class Volqueta implements Conducir, Cargar{

    @Override
    public void conducir(){
        System.out.println("La volqueta está conduciendo");
    }

    @Override
    public void cargarMercancia(double carga){
        System.out.println("La volqueta lleva una carga de "+carga+" kg");
    }
}
