import contas.*;
import excecoes.ClienteJaCadastradoExcepition;
import excecoes.SaldoInsuficienteException;
import excecoes.ValorInvalidoException;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Cliente> cliente = new ArrayList<>();
        int op;
        do{
            System.out.println("Como deseja prosseguir? ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    try {
                        System.out.print("CPF: ");
                        String cpf = sc.nextLine();
                        for (Cliente c : cliente) {
                            if (c.getCPF().equals(cpf)) {
                                throw new ClienteJaCadastradoExcepition(cpf);
                            }
                        }

                        System.out.print("nome: ");
                        String nome = sc.nextLine();
                        System.out.print("email: ");
                        String email = sc.nextLine();

                        System.out.println("Número da Conta corrente: ");
                        int numeroDaContaCorrente = sc.nextInt();
                        System.out.println("Taxa da conta corrente: ");
                        double taxaDaContaCorrente = sc.nextDouble();
                        System.out.println("Número da Conta poupança: ");
                        int numeroDaContaPoupanca = sc.nextInt();
                        System.out.println("Taxa da conta poupanca: ");
                        double taxaDaContaPoupanca = sc.nextDouble();
                        System.out.println("Saldo que deseja aplicar nas duas contas: "); //Nesse caso, ambas as contas teão o mesmo valor ao iniciar o cadastro;
                        double saldoDasContas = sc.nextDouble();

                        Conta contaPoupanca = new ContaPoupanca(numeroDaContaPoupanca, taxaDaContaPoupanca, saldoDasContas);
                        Conta contaCorrente = new ContaCorrente(numeroDaContaCorrente, taxaDaContaCorrente, saldoDasContas);
                        Cliente novoCliente = new Cliente(cpf, nome, email, contaCorrente, contaPoupanca);
                        cliente.add(novoCliente);
                        break;
                    } catch (ClienteJaCadastradoExcepition e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                case 2:
                    try {
                        System.out.print("Digite seu CPF: ");
                        String CpfParaSacar = sc.nextLine();
                        System.out.print("Digite o valor para saque: ");
                        double valor = sc.nextDouble();

                        if (valor <= 0) {
                            throw new ValorInvalidoException();
                        }

                        for (Cliente c : cliente) {
                            if (c.getCPF().equals(CpfParaSacar)) {
                                if (c.getContaCorrente().getSaldo() < valor) {
                                    throw new SaldoInsuficienteException();
                                } else {
                                    c.getContaCorrente().debitar(valor);
                                    break;
                                }
                            }
                        }
                    } catch (SaldoInsuficienteException | ValorInvalidoException e ){
                        System.out.print(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opção inválida");

            }

        }while (op!=0);
    }
}