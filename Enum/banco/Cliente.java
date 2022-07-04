import java.util.ArrayList;
import java.util.Objects;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, double transacaoInicial) {
        this.nome = nome;
        transacoes = new ArrayList<>();
        adicionarTransacao(transacaoInicial);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return nome.equals(cliente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public void adicionarTransacao(double valorTransacao){
        transacoes.add(valorTransacao);
    }
}
