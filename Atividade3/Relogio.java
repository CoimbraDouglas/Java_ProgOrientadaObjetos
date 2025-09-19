public class Relogio {
    int horasTotal = 24;
    int minutoTotal = 60;

    public void imprimirTempoRestanteDia(int horas) {
        System.out.println("As horas restantes do dia são: "+(horasTotal-horas));
    }
    public void imprimirTempoRestanteDia(int horas, int minutos){
        if(minutos>0) {
            System.out.println("Faltam: " + (horasTotal - 1 - horas) + " horas no dia e "+(minutoTotal-minutos)+" minutos.");
        }
        if(minutos>60) {
            System.out.println("Informe um valor para os minutos entre 0-60.");
        }
        else{
            imprimirTempoRestanteDia(horas);
        }
    }
}
