public class Empregado {
    private double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta())
            return 0.1 * getSalarioFixo();
        else return  0.0;
    }
    public double calcularSalarioTotal(Departamento departamento){
        return getSalarioFixo() + calcularBonus(departamento);
    }
}
