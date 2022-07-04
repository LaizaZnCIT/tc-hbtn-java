import java.util.Objects;

public class Contato {
    private String nome;
    private String numero;
    private TipoNumero tipo;

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public TipoNumero getTipo() {
        return tipo;
    }

    public Contato(String nome, String numero, TipoNumero tipo) {
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

}
