public class Suma extends Termino{

    private Termino izquierda;
    private  Termino derecha;

    public Suma(Termino izquierda, Termino derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
    public int sumar(){
        int valorIzquierda = 0,valorDerecha = 0;
        if(izquierda instanceof  Numero){
            valorIzquierda = ((Numero)izquierda).getValor();
        }
        if(derecha instanceof  Numero){
            valorDerecha = ((Numero)derecha).getValor();
        }

        return  valorIzquierda+valorDerecha;
    }
}
