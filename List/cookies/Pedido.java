import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int total = 0;
        for (PedidoCookie p : cookies){
            total += p.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor){
        int total = 0;
        Iterator<PedidoCookie> i = cookies.iterator();
        while (i.hasNext()){
            PedidoCookie j = i.next();
            if(sabor.equals(j.getSabor())){
                i.remove();
                total+=j.getQuantidadeCaixas();
            }
        }
        return total;
    }
}
