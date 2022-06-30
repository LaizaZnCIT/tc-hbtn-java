import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class ListaTelefonica {
    HashMap<String, ArrayList<Telefone>> nomeTelefone;

    public ListaTelefonica() {
        nomeTelefone = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        ArrayList<Telefone> telefones = nomeTelefone.get(nome);
        if(telefones == null){
            telefones = new ArrayList<Telefone>();
        }
        telefones.add(telefone);
        nomeTelefone.put(nome, telefones);

    }

    public ArrayList<Telefone> buscar(String nome){
        for(Map.Entry<String, ArrayList<Telefone>> nt : nomeTelefone.entrySet()){
            if(nome.equals(nt.getKey())){
                return nt.getValue();
            }
        }
        return null;
    }
}
