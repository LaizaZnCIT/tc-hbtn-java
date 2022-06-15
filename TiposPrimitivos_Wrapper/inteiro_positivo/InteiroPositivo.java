public class InteiroPositivo {
    int valor;

    public InteiroPositivo(int valor) {
        this.valor = valor;
    }
    public InteiroPositivo(String valor) {
        this.valor = Integer.parseInt(valor);
    }

    public int getValor(){
        if(valor < 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        else{
            return valor;
        }
    }
    public void setValor(int valor){
        if(valor < 0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        } else {
            this.valor = valor;
        }
    }
    public boolean ehPrimo(){
        boolean flag = true;
        if(valor == 1){
            flag = false;
        }
        for(int i = 2; i < valor; i++){
            if(valor % i == 0){
                flag = false;
            }
        }
        return flag;
    }
}
