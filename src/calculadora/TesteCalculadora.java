package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Operações válidas: entrada | esperado | obtido
        System.out.println("Soma          2 + 3   | esperado: 5  | obtido: " + calculadora.calc(2, 3, "+"));
        System.out.println("Subtração     10 - 4  | esperado: 6  | obtido: " + calculadora.calc(10, 4, "-"));
        System.out.println("Multiplicação 3 * 5   | esperado: 15 | obtido: " + calculadora.calc(3, 5, "*"));
        System.out.println("Divisão       8 / 2   | esperado: 4  | obtido: " + calculadora.calc(8, 2, "/"));

        // Divisão por zero deve lançar exceção
        try {
            System.out.println(calculadora.calc(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Divisão       8 / 0   | esperado: exceção | obtido: " + e.getMessage());
        }

        // Operador inválido deve lançar exceção
        try {
            System.out.println(calculadora.calc(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Operador      5 x 5   | esperado: exceção | obtido: " + e.getMessage());
        }

        // Operador nulo deve lançar exceção (e não interromper o programa com NullPointerException)
        try {
            System.out.println(calculadora.calc(5, 5, null)); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Operador nulo 5 ? 5   | esperado: exceção | obtido: " + e.getMessage());
        }
    }
}
