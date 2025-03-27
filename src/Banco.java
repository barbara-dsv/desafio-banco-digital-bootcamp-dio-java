import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public void listarClientes(){
        if(contas.isEmpty()){
            System.out.println("Ná há clientes cadastrados");
            return;
        }
        contas.stream().map(conta -> {
            Cliente cliente = conta.getCliente();
            return String.format(
                    "Nome: %s\nCPF: %s\nEndereço: %s\nTelefone: %s\nEmail: %s\n",
                    cliente.getNome(),
                    cliente.getCpf(),
                    cliente.getEndereco(),
                    cliente.getTelefone(),
                    cliente.getEmail()
            );
        }).distinct().forEach(System.out::println);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;

    }

}
