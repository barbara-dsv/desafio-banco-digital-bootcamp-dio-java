import jdk.jshell.EvalException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        ArrayList<Conta> contas = new ArrayList<>();

        Cliente barbara = new Cliente("Bárbara","07789563155","Rua moraujo, 376", "barbara@gmail.com", "85998546312");
        Conta contaCorrenteBarbara = new ContaCorrente(barbara);
        Conta contaPoupancaBarbara = new ContaPoupanca(barbara);
        contas.add(contaCorrenteBarbara);
        contas.add(contaPoupancaBarbara);
        contaCorrenteBarbara.depositar(1000);

        Cliente valeria = new Cliente("Valéria", "45218759545", "Rua 17", "valeria@gmail.com", "85978985463");
        Conta contaCorrenteValeria = new ContaCorrente(valeria);
        Conta contaPoupancaValeria = new ContaPoupanca(valeria);
        contas.add(contaCorrenteValeria);
        contas.add(contaPoupancaValeria);
        contaPoupancaValeria.depositar(500);

        Cliente joao = new Cliente("Joao", "02597563155", "Rua XV", "joao@gmail.com", "8599999999");
        Conta contaCorrenteJoao = new ContaCorrente(joao);
        contas.add(contaCorrenteJoao);

        banco.setContas(contas);

        banco.listarClientes();
        banco.listarContasPoupancas();
        banco.listarContasCorrentes();
        banco.saldoDeTodasContas();
    }
}