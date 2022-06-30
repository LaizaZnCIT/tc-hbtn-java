import java.util.*;
public class Blog {
    private ArrayList<Post> postagens;

    public Blog() {
       postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem){
        postagens.add(postagem);
    }
    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<>();
        for(Post p: postagens){
            autores.add(p.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> categorias = new TreeMap<>();
        for(Post p: postagens){
            Integer count = categorias.get(p.getCategoria());
            if(count  == null)
                categorias.put(p.getCategoria(), 1);
            else {
                categorias.put(p.getCategoria(), ++count);
            }
        }
        return categorias;
    }
}
