import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        canais = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacao canalNotificacao){
        canais.add(canalNotificacao);
    }

    public void processar(Video video){
        for(CanalNotificacao cn : canais){
            cn.notificar(new Mensagem(video.getArquivo() + " - " +  video.getFormato(), TipoMensagem.LOG));
        }
    }
}
