package calculadora;

public class Calculadora {

    // Calcula a operação entre a e b de acordo com o operador op
    public int calc(int a, int b, String op) {
        int r = 0;
        if (op == null) {
            throw new IllegalArgumentException("Operador inválido: null");
        } else if (op.equals("+")) {
            r = a + b;
        } else if (op.equals("-")) {
            r = a - b;
        } else if (op.equals("*")) {
            r = a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                throw new IllegalArgumentException("Divisão por zero não é permitida.");
            } else {
                r = a / b;
            }
        } else {
            throw new IllegalArgumentException("Operador inválido: " + op);
        }
        return r;
    }
}
