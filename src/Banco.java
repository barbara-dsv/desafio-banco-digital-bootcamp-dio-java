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
        contas.stream().map(conta -> conta.getCliente().getNome()).distinct().forEach(System.out::println);
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
