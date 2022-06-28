import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    List<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        for (Tarefa t: tarefas){
            if(t.getIdentificador() == tarefa.getIdentificador()){
                throw new IllegalArgumentException("Tarefa com identificador "+ tarefa.getIdentificador() + " ja existente na lista");
            }
        }

        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador){
        for(Tarefa t: tarefas){
            if(identificador == t.getIdentificador()){
                t.setEstahFeita(true);
                return t.isEstahFeita();
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador){
        for(Tarefa t: tarefas){
            if(identificador == t.getIdentificador()){
                t.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas(){
        for(Tarefa t: tarefas){
            t.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for(Tarefa t: tarefas){
            t.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for (Tarefa t: tarefas){
            String s = t.isEstahFeita() ? "X" : " ";
            System.out.println("["+ s +"]  Id: " + t.getIdentificador() + " Descricao: " + t.getDescricao());
        }
    }
}
