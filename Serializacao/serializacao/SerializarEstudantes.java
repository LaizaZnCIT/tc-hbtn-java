import java.io.*;
import java.util.List;

@SuppressWarnings("unchecked")
public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes){
        try{
            FileOutputStream fos = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(estudantes);

        } catch (Exception ex) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar(){
        List<Estudante> estudantes = null;
        try {
            FileInputStream fis = new FileInputStream(nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            estudantes = (List<Estudante>) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Nao foi possivel desserializar");
        }
        return estudantes;
    }
}
