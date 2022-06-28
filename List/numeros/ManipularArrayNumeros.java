import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> lista, int numeroBuscado){
        for(Integer i : lista){
            if(i == numeroBuscado){
                return lista.indexOf(i);
            }
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> lista, int numeroASerAdicionado){
        if(buscarPosicaoNumero(lista, numeroASerAdicionado) == -1){
            lista.add(numeroASerAdicionado);
        } else {
            throw new ArithmeticException("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> lista, int numeroASerRemovido){
        if(buscarPosicaoNumero(lista, numeroASerRemovido) != -1){
            int posicao = buscarPosicaoNumero(lista, numeroASerRemovido);
            lista.remove(posicao);
        } else {
            throw new ArithmeticException("Numero nao encontrado na lista");
        }
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto){
        if(buscarPosicaoNumero(lista, numeroSubstituir) == -1){
            lista.add(numeroSubstituto);
        } else {
            int posicao = buscarPosicaoNumero(lista, numeroSubstituir);
            lista.set(posicao, numeroSubstituto);
        }
    }
}
