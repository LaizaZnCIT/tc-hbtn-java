import atividades.Atividade;

public class MaquinaWorkflow {

    public void executar(Workflow workflow){
        for(Atividade a: workflow.getAtividades()){
            a.executar();
        }

    }
}
