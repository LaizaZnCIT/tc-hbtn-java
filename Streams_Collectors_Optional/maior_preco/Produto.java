public class Produto {
    private int codigo;
    private String nome;
    private CategoriaProduto categoria;
    private double preco;

    public Produto(int codigo, String nome, CategoriaProduto Categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = Categoria;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString(){
        java.util.Locale locale = new java.util.Locale("pt", "BR");
        return String.format(locale, "[%d] %s %s R$ %.2f", codigo, nome, categoria, preco);
    }
}
