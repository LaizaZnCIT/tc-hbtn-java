import java.util.Objects;

public class Post implements Comparable<Post>{
    private Autor autor;
    private String titulo;
    private String corpo;
    private Enum categoria;

    public Post(Autor autor, String titulo, String corpo, Enum categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public Enum getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return titulo.equals(post.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    @Override
    public String toString(){
        return titulo;
    }

    @Override
    public int compareTo(Post o) {
        return titulo.compareTo(o.titulo);
    }
}
