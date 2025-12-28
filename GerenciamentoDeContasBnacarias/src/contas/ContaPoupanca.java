package contas;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numeroDaConta, double taxa, double saldo) {
        super(numeroDaConta, taxa, saldo);
    }

    @Override
    public void atualizar() {
        creditar(getTaxa());
    }
}
