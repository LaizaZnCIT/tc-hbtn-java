import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase){
        String[] palavras = frase.toLowerCase().replace("!", "").replace("?", "").
                split("[/. ]+");

        TreeMap<String, Integer> palavrasContadas = new TreeMap<>();

        for(String p : palavras){
            Integer count = palavrasContadas.get(p);
            if(count == null){
                palavrasContadas.put(p, 1);
            } else {
                palavrasContadas.put(p, ++count);
            }
        }
        return palavrasContadas;
    }
}
