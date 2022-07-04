import java.util.ArrayList;
import java.util.Objects;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencia agencia = (Agencia) o;
        return nome.equals(agencia.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public boolean novoCliente(String nomeCliente, double valorTransacao){
        if(clientes.size() == 0 || buscarCliente(nomeCliente) == null){
            clientes.add(new Cliente(nomeCliente, valorTransacao));
            return true;
        }
        return false;

    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao){
        if(buscarCliente(nomeCliente) != null){
            buscarCliente(nomeCliente).adicionarTransacao(valorTransacao);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String nomeCliente){
        for(Cliente c : clientes){
            if(c.getNome().equals(nomeCliente))
                return c;
        }
        return null;
    }
}
