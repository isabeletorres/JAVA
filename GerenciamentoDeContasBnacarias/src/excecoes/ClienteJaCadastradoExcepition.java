package excecoes;

public class ClienteJaCadastradoExcepition extends RuntimeException {
    public ClienteJaCadastradoExcepition(String cpf) {
        super("Erro: O cliente com CPF " + cpf + " já está cadastrado no sistema.");
    }
}
