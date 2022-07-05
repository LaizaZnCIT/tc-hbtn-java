package provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public  Frete calcularFrete(double peso, double valor){
        if(peso > 1000)
            valor *= 0.1;
        else
            valor *= 0.05;
        return new Frete(valor, obterTipoProvedorFrete());
    }

    public TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.SEDEX;
    }
}
