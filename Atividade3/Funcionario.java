public abstract class Funcionario {
    protected String nome;
    protected int CPF;
    protected double salarioBase=1412.32;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }



    public Funcionario(String nome, int CPF) {
        this.nome = nome;
        this.CPF = CPF;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public abstract double calculaSalario();

    public void exibir(){
        System.out.println("Nome: " +nome);
        System.out.println("CPF: " +CPF);
        System.out.println("Salário base: " +salarioBase);
        System.out.println("Salário total: " +this.calculaSalario());
    }
}
