import jdk.jshell.EvalException;

public class Main {
    public static void main(String[] args) {
        Cliente barbara = new Cliente();
        barbara.setNome("Bárbara");

        Conta cc = new ContaCorrente(barbara);
        Conta cp = new ContaPoupanca(barbara);

        Cliente Valeria = new Cliente();
        Valeria.setNome("Valéria");

        Conta contaCorrenteValeria = new ContaCorrente(Valeria);
        Conta contaPoupancaValeria = new ContaPoupanca(Valeria);
        contaCorrenteValeria.depositar(1000);
        contaCorrenteValeria.transferir(cc, 50);
        contaCorrenteValeria.extrato();



        cc.depositar(100);
        cc.transferir(cp,100);

    cc.extrato();
    cp.extrato();


    }
}