import humor.*;
import comida.*;

public class Personagem {
    private int pontosDeFelicidade;

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    public Humor obterHumorAtual(){
        if(pontosDeFelicidade < -5){
            return new Irritado();
        }else if(pontosDeFelicidade >= -5 && pontosDeFelicidade <= 0){
            return new Triste();
        }else if(pontosDeFelicidade >= 1 && pontosDeFelicidade <= 15){
            return new Feliz();
        }else{
            return new MuitoFeliz();
        }
    }

    public void comer(Comida[] comidas){
        for(Comida c : comidas){
            setPontosDeFelicidade(pontosDeFelicidade += c.getPontosDeFelicidade());
        }
    }

    @Override
    public String toString() {
        return getPontosDeFelicidade() + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}
