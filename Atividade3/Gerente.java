public class Gerente extends Funcionario {

    public Gerente(String nome, int CPF){
        super(nome,CPF);
    }
    @Override
    public double calculaSalario(){
        return 3*getSalarioBase();
    }


}
