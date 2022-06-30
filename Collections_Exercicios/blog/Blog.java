import java.util.*;
public class Blog {
    private List<Post> posts;

    public Blog() {
       posts = new LinkedList<>();
    }

    public void adicionarPostagem(Post novoPost){
        posts.add(novoPost);
    }
    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<>();
        for(Post p: posts){
            autores.add(p.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> categorias = new TreeMap<>();
        for(Post p: posts){
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
