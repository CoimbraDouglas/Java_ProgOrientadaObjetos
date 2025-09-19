public class testeFuncionairo {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Paulo Henrique",1428519625);
        Funcionario f2 = new Vendedor("Sergio Marques", 1448552036);
        Funcionario f3 = new Vendedor("Patricia Emanuely", 1425410036);
        Funcionario f4 = new Vendedor("Sara Oliveira", 1444182036);



        f1.setCPF(1428519885);
        f1.exibir();
        f2.exibir();

    }
}
