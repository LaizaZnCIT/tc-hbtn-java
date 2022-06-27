public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double valorTotal = 0.0;
        for(ItemPedido i : itens){
            valorTotal += i.getProduto().obterPrecoLiquido() * i.getQuantidade();
        }
        return valorTotal - (valorTotal * percentualDesconto / 100);
    }
}
