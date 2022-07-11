import java.util.ArrayList;
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
}
