import java.util.ArrayList;
import java.util.Locale;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        for (Agencia a : agencias) {
            if (a.getNome().equals(nomeAgencia))
                return a;
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        if (agencias.size() == 0 || buscarAgencia(nomeAgencia) == null) {
            agencias.add(new Agencia(nomeAgencia));
            return true;
        }
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if(agencia.novoCliente(nomeCliente, valorTransacao)){
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        Agencia agencia = buscarAgencia(nomeAgencia);
        if(buscarAgencia(nomeAgencia) != null && agencia.buscarCliente(nomeCliente) != null){
            agencia.adicionarTransacaoCliente(nomeCliente, valorTransacao);
            return true;
        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacao){
        Agencia agencia = buscarAgencia(nomeAgencia);
        java.util.Locale locale = new java.util.Locale("en", "US");
        if(buscarAgencia(nomeAgencia) != null){
            if(!imprimeTransacao){
                for(Cliente c : agencia.getClientes()){
                    System.out.print("Cliente: " + c.getNome() + " [" + agencia.getClientes().indexOf(c) + "]" + "\n");
                }
            } else {
                for (Cliente c : agencia.getClientes()){
                    System.out.printf("Cliente: %s [%d]\n", c.getNome(), agencia.getClientes().indexOf(c)+1);
                    for(Double t : c.getTransacoes()){
                        System.out.printf(locale,"  [%d] valor %.2f\n", c.getTransacoes().indexOf(t)+1, t);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
