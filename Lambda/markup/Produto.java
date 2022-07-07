import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    protected double percentualMarkup;
    protected Supplier<Double> precoComMarkup;
    protected Consumer<Double> atualizarMarkup;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        percentualMarkup = 0.1;
        precoComMarkup = () -> preco + percentualMarkup * preco;
        atualizarMarkup = (Double d) -> percentualMarkup = d / 100;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
