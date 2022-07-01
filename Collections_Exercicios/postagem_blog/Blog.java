import java.util.*;
public class Blog {
    private List<Post> postagens;

    public Blog() {
       postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem){
        if(postagens != null){
            if(postagens.contains(postagem)){
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        postagens.add(postagem);
    }
    public Set<Autor> obterTodosAutores(){
        Set<Autor> autores = new TreeSet<>();
        for(Post p: postagens){
            autores.add(p.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> categorias = new TreeMap<>();
        for(Post p: postagens){
            Integer count = categorias.get(p.getCategoria());
            if(count  == null)
                categorias.put((Categorias) p.getCategoria(), 1);
            else {
                categorias.put((Categorias) p.getCategoria(), ++count);
            }
        }
        return categorias;
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> postsPorAutor = new TreeSet<>();
        for (Post p: postagens){
           if(autor.equals(p.getAutor())){
               postsPorAutor.add(p);
           }
        }
        return postsPorAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> postsPorCategoria = new TreeSet<>();
        for(Post p: postagens){
            if(p.getCategoria() == categoria){
                postsPorCategoria.add(p);
            }
        }
        return postsPorCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> todosPostsPorCategoria = new TreeMap<>();
        for(Post p: postagens){
            todosPostsPorCategoria.put((Categorias)p.getCategoria(), obterPostsPorCategoria((Categorias) p.getCategoria()));
        }
        return todosPostsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> todosPostsPorAutor = new TreeMap<>();
        for(Post p: postagens){
            todosPostsPorAutor.put(p.getAutor(), obterPostsPorAutor(p.getAutor()));
        }
        return todosPostsPorAutor;
    }
}
