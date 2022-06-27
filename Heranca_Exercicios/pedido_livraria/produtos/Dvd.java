package produtos;

public class Dvd extends Produto {
    protected String diretor;
    protected String genero;
    protected int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public double obterPrecoLiquido(){
        return precoBruto + precoBruto * 0.2;
    }
}
