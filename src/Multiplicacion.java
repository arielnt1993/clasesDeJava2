public class Multiplicacion extends Operacion {


    public Multiplicacion(Termino izquierda, Termino derecha) {
        super(izquierda, derecha);
    }

    @Override
    public int valuar() {
        return izquierda.valuar()*derecha.valuar();
    }
}
