public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("=== Extrato conta poupança ===");
        super.imprimirInfosBasicas();
    }
}
