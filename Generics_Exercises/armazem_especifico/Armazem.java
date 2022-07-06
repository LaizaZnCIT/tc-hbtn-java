import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T>{
    private Map<String, T> itens;

    public Armazem() {
        itens = new HashMap<>();
    }

    public Map<String, T> getItens() {
        return itens;
    }

    @Override
    public void adicionarAoInventario(String nome, T valor){
        itens.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome){
        return itens.get(nome);
    }
}
