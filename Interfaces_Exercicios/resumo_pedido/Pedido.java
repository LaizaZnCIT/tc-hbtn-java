import provedores.Frete;

public class Pedido {
    private int codigo;
    private int peso;
    private double valor;

    private Frete frete;

    public Pedido(int codigo, int peso, double valor) {
        this.codigo = codigo;
        this.peso = peso;
        this.valor = valor;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public Frete getFrete() {
        return frete;
    }

    public int getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }
}
