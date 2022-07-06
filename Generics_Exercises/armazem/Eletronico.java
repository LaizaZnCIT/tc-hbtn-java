public class Eletronico {
    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString(){
        java.util.Locale locale = new java.util.Locale("pt", "BR");
        return String.format(locale, "[%s] R$ %.6f", getDescricao(), getValor());
    }
}
