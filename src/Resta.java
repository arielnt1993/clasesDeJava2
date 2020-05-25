public class Resta extends Operacion {

    public Resta(Termino izquierda, Termino derecha) {
        super(izquierda,derecha);
    }

    @Override
    public int valuar() {
        return izquierda.valuar()-derecha.valuar();
    }
}
