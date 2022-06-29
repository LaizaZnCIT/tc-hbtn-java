import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros){
        TreeSet<Integer> numerosDuplicados = new TreeSet<>();
        Set<Integer> encontraDuplicados = new HashSet<>();
        for(int n : numeros){
            if(!encontraDuplicados.add(n)){
                numerosDuplicados.add(n);
            }
        }
        return numerosDuplicados;
    }
}
