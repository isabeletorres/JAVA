package contas;

public class ContaCorrente extends Conta{


    public ContaCorrente(int numeroDaConta, double taxa, double saldo) {
        super(numeroDaConta, taxa, saldo);
    }

    @Override
    public void atualizar() {
        debitar(getTaxa());
    }
}
