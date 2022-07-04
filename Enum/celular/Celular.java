import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos;

    public Celular() {
        contatos = new ArrayList<>();
    }

    public int obterPosicaoContato(String nome){
        for(Contato c : contatos){
            if(c.getNome().equals(nome))
                return contatos.indexOf(c);
        }
        return -1;
    }

    public void adicionarContato(Contato contato){
        if(obterPosicaoContato(contato.getNome()) != -1)
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        if(obterPosicaoContato(contatoAntigo.getNome()) == -1)
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        if(obterPosicaoContato(contatoAntigo.getNome()) != obterPosicaoContato(novoContato.getNome())){
            if(obterPosicaoContato(novoContato.getNome()) != -1){
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            }
        }

        contatos.set(contatos.indexOf(contatoAntigo), novoContato);
    }

    public void removerContato(Contato contato){
        if(obterPosicaoContato(contato.getNome()) == -1)
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        contatos.remove(contato);
    }

    public void listarContatos(){
        for (Contato c: contatos)
            System.out.println(c.getNome() + " -> " + c.getNumero() + " (" + c.getTipo() + ")");
    }
}
