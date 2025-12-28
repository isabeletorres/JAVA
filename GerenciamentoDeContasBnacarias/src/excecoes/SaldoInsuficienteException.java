package excecoes;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("Valor digitado é insuficiente");
    }
}
