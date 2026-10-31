package calculadora;

public class Calculadora {

    public static final String SOMA = "+";

    public static final String SUBTRACAO = "-";

    public static final String MULTIPLICACAO = "*";

    public static final String DIVISAO = "/";

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public int calc(int a, int b, String operador) {
        // Operador nulo é tratado antes do switch para evitar NullPointerException
        if (operador == null) {
            throw new IllegalArgumentException("Operador inválido: null");
        }

        // O switch substitui a cadeia de if/else, deixando cada operador em uma linha
        return switch (operador) {
            case SOMA -> somar(a, b);
            case SUBTRACAO -> subtrair(a, b);
            case MULTIPLICACAO -> multiplicar(a, b);
            case DIVISAO -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
