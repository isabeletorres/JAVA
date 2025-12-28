package contas;

public abstract class Conta {

    private int NumeroDaConta;
    private double taxa;
    private double saldo;

    public Conta(int numeroDaConta, double taxa, double saldo) {
        NumeroDaConta = numeroDaConta;
        this.taxa = taxa;
        this.saldo = saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDaConta() {
        return NumeroDaConta;
    }

    public void debitar(double valor){
        this.saldo -= valor;
    }
    public void creditar(double valor){
        this.saldo += valor;
    }

    public abstract void atualizar();
}
