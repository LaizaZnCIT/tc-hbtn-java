public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome){
        this.nome = nome;
        setSaudeAtual(saudeAtual);
    }
    public int getSaudeAtual(){
        return saudeAtual;
    }
    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(this.saudeAtual == 0){
            status = "morto";
        } else {
            status = "vivo";
        }
    }
    public String getStatus(){
        return status;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome != null && !nome.equals("")){
            this.nome = nome;
        }
    }

    public void tomarDano(int quantidadeDeDano){
        int saude = saudeAtual - quantidadeDeDano;
        if(saude < 0){
            saude = 0;
        }
        setSaudeAtual(saude);
    }

    public void receberCura(int quantidadeDeCura){
        int saude = saudeAtual + quantidadeDeCura;
        if(saude > 100){
            saude = 100;
        }
        setSaudeAtual(saude);
    }
}
