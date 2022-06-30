import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class ListaTelefonica {
    HashMap<String, HashSet<Telefone>> nomeTelefone;

    public ListaTelefonica() {
        nomeTelefone = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        HashSet<Telefone> telefones = nomeTelefone.get(nome);
        if(telefones == null){
            telefones = new HashSet<Telefone>();
        } else {
            if(telefones.contains(telefone)){
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }
            for(String chave : nomeTelefone.keySet()){
                if(nome == chave){
                    continue;
                }
                if(nomeTelefone.get(chave).contains(telefone)){
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        }

        telefones.add(telefone);
        nomeTelefone.put(nome, telefones);

    }

    public HashSet<Telefone> buscar(String nome){
        return nomeTelefone.get(nome);
    }
}
