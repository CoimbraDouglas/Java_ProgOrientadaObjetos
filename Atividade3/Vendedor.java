public class Vendedor extends Funcionario{
    double totalVendasMes;

    public double getTotalVendasMes() {
        return totalVendasMes;
    }

    public void setTotalVendasMes(double totalVendasMes) {
        this.totalVendasMes = totalVendasMes;
    }

    public Vendedor(String nome, int CPF) {
        super(nome, CPF);
    }

    @Override
    public double calculaSalario(){
        return getSalarioBase() + (getTotalVendasMes()*0.05);
    }
}
