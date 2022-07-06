public class ArmazemDeEletronico<T extends Eletronico> extends Armazem<T>{

    public void adicionarAoInventario(String nome, T valor){
        getItens().put(nome, valor);
    }

    public T obterDoInventario(String nome){
        return getItens().get(nome);
    }
}
