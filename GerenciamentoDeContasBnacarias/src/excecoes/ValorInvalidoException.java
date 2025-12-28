package excecoes;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException() {
        super("Valor digitado é invalido");
    }
}
