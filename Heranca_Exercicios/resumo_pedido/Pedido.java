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
    public void apresentarResumoPedido(){
        java.util.Locale locale = new java.util.Locale("pt", "BR");
        double valorTotal = 0.0;
        System.out.println("------- RESUMO PEDIDO -------");
        for(ItemPedido i : itens){
            valorTotal += i.getProduto().obterPrecoLiquido() * i.getQuantidade();
            System.out.printf(locale, "Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f%n", i.getProduto().getClass().getSimpleName(), i.getProduto().getTitulo(),
                    i.getProduto().obterPrecoLiquido(), i.getQuantidade(), i.getProduto().obterPrecoLiquido() * i.getQuantidade());
        }
        System.out.println("----------------------------");
        System.out.printf(locale, "DESCONTO: %.2f%n", valorTotal * percentualDesconto / 100);
        System.out.printf(locale, "TOTAL PRODUTOS: %.2f%n", valorTotal);
        System.out.println("----------------------------");
        System.out.printf(locale, "TOTAL PEDIDO: %.2f%n", calcularTotal());
        System.out.println("----------------------------");
    }
}
