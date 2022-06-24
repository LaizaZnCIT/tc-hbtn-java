import exceptions.*;
public class ContaBancariaTarifada extends ContaBancariaBasica{
    private int quantidadeTransacoes;
    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException{
        super.depositar(valor);
        setSaldo(this.getSaldo() - 0.1);
    }
    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        setSaldo(this.getSaldo() - 0.1);
    }
}
