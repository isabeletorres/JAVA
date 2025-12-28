import contas.Conta;

public class Cliente {

    private String CPF;
    private String nome;
    private String email;
    private Conta contaCorrente;
    private Conta contaPoupanca;

    public Cliente(String CPF, String nome, String email, Conta contaCorrente, Conta contaPoupanca) {
        this.CPF = CPF;
        this.nome = nome;
        this.email = email;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Conta contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public Conta getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(Conta contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
