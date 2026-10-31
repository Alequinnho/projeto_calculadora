package calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal ({@link #calc(int, int, String)})
 * que seleciona a operação desejada com base em um operador informado.</p>
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 *     <li>Testes funcionais e unitários</li>
 *     <li>Tratamento de erros com exceções</li>
 *     <li>Aplicação de refatoração em código Java</li>
 *     <li>Documentação com Javadoc</li>
 * </ul>
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 *
 * @author Alex Francisco de Camargo
 * @version 1.0
 */
public class Calculadora {

    /** Operador da soma. */
    public static final String SOMA = "+";

    /** Operador da subtração. */
    public static final String SUBTRACAO = "-";

    /** Operador da multiplicação. */
    public static final String MULTIPLICACAO = "*";

    /** Operador da divisão. */
    public static final String DIVISAO = "/";

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     *
     * @param a primeiro operando (minuendo)
     * @param b segundo operando (subtraendo)
     * @return o resultado de {@code a} menos {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da multiplicação de {@code a} por {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros, impedindo a divisão por zero.
     *
     * @param a dividendo
     * @param b divisor
     * @return o quociente inteiro de {@code a} por {@code b}
     * @throws IllegalArgumentException se o divisor ({@code b}) for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * <p>Executa a operação matemática solicitada com base no operador informado.</p>
     *
     * <p>Operadores aceitos:</p>
     * <ul>
     *     <li>{@value #SOMA}: Soma</li>
     *     <li>{@value #SUBTRACAO}: Subtração</li>
     *     <li>{@value #MULTIPLICACAO}: Multiplicação</li>
     *     <li>{@value #DIVISAO}: Divisão</li>
     * </ul>
     *
     * <p>Qualquer operador inválido (ou nulo) resulta em exceção.</p>
     *
     * @param a        primeiro operando
     * @param b        segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente ao operador informado
     * @throws IllegalArgumentException se o operador for nulo ou não for um símbolo válido,
     *                                  ou se for solicitada uma divisão por zero
     */
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
