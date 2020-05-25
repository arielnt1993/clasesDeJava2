public class Principal {
    public static void main(String[] args) {
        Numero a = new Numero(2);
        Numero b = new Numero(4);
        Numero c = new Numero(7);
        Suma s = new Suma(a,b);
        Suma r = new Suma(s,c);
        int resultado = r.valuar();
        System.out.println("el resultado de a+b es: "+resultado);
    }
}
