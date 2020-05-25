public class Principal {
    public static void main(String[] args) {
        Numero a = new Numero(2);
        Numero b = new Numero(4);
        Suma c = new Suma(a,b);
        int resultado = c.sumar();
        System.out.println("el resultado de a+b es: "+resultado);
    }
}
