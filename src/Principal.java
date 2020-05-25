public class Principal {
    public static void main(String[] args) {
        Numero a = new Numero(2);
        Numero b = new Numero(4);
        Numero c = new Numero(7);
        Operacion s = new Suma(a,b);
        Multiplicacion r = new Multiplicacion(s,c);
        int resultado = r.valuar();
        System.out.println("el resultado de a+b es: "+resultado);
    }
}
