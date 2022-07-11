import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar (List<Produto> produtos, CriterioFiltro criterioFiltro){
        List<Produto> listaFiltrada = new ArrayList<>();
        for(Produto p: produtos){
            if(criterioFiltro.testar(p)){
                listaFiltrada.add(p);
            }
        }
            return listaFiltrada;
    }
}
