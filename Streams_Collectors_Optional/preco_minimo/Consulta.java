import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        List<Produto> produtosFiltrados = pedido.getProdutos();
        return produtosFiltrados.
                stream().
                filter(p -> p.getCategoria() == CategoriaProduto.LIVRO).
                collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        return produtos.stream().sorted(Comparator.comparing(Produto::getPreco).reversed()).findFirst().get();
    }
}
