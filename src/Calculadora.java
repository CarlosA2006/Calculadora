public class Calculadora {
    public int sumar(int a, int b) {
        return realizarSuma(a, b);
    }

    public int restar(int a, int b) {
        return realizarResta(a, b);
    }

    private int realizarSuma(int a, int b) {
        return a + b;
    }

    private int realizarResta(int a, int b) {
        return a - b;
    }
    public int multiplicar(int a, int b) {
        return a * b;
    }

}
