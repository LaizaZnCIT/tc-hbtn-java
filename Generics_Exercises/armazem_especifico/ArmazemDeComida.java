import java.util.Map;

public class ArmazemDeComida<T extends Comida> extends Armazem<T>{

    public void adicionarAoInventario(String nome, T valor){
        getItens().put(nome, valor);
    }

    public T obterDoInventario(String nome){
        return getItens().get(nome);
    }

}
