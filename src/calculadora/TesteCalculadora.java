package calculadora;

/**
 * <p><strong>Testes da classe {@link Calculadora}</strong></p>
 *
 * <p>Executa as quatro operações, a divisão por zero, um operador inválido
 * e um operador nulo. Para cada teste são exibidos a entrada utilizada,
 * o resultado esperado e o resultado obtido.</p>
 *
 * @author Alex Francisco de Camargo
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal que executa os testes e imprime os resultados no console.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
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
