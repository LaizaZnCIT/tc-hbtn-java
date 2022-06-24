import exceptions.*;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0.0;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException{
        if(valor > 0)
            this.saldo += valor;
        else
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
    }

    public void sacar(double valor) throws OperacaoInvalidaException{
        if(valor > 0){
            if(valor <= this.getSaldo()){
                this.saldo -= valor;
            }
            else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }
        } else
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
    }

    public double calcularTarifaMensal(){
        double porcentagemDoSaldo = 0.1 * this.getSaldo();
        if(porcentagemDoSaldo < 10){
            return porcentagemDoSaldo;
        } else {
            return 10.0;
        }
    }

    public double calcularJurosMensal(){
        if(this.getSaldo() < 0){
            return 0.0;
        } else {
            return (this.getTaxaJurosAnual() / 100.0) / 12;
        }
    }

    public void aplicarAtualizacaoMensal(){
        double valorJurosMensal = this.saldo * calcularJurosMensal();
        this.saldo -= calcularTarifaMensal();
        this.saldo += valorJurosMensal;
    }
}
