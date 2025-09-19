public class Aluno{
	public String nome;
	public int matricula;
	public double nota_mat;
	public double nota_ bio;
	private int CPF;

	public Aluno(String nome, int matricula, double nota_mat, double nota_bio){
		this.nome = nome;
		this.matricula = matricula;
		this.nota_mat = nota_mat;
		this.nota_bio = nota_bio;
		this.CPF = "";
	}
	public void setCPF(valor){
		this.CPF = valor;	
	}
	public String getCPF(){
		return this.CPF;
	}
	

	public double calcularMedia(){
		double media = (nota_mat + nota_bio)/2;
		return media;
	}

	public void calcularMedia() {
        	media = (nota_mat + nota_bio) / 2;
    	}
	
	public void exibirinformação() {
        	calcularMedia(); // Certificar-se de que a média é calculada
        	System.out.println("A sua média das notas é " + media);
    	}


	public void exibirinformação(){
		calcularMedia();
		System.out.println("A sua media das notas é "+media);
	}
}