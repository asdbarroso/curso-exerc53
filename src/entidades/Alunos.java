package entidades;

public class Alunos {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double totalNotas() {
		return nota1 + nota2 + nota3;
	}

	public void situacaoAluno() {
		double pontosFaltam = 60.00 - totalNotas();
		if (totalNotas() > 60.00) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
			System.out.printf("Faltam %.2f pontos", pontosFaltam);
		}
	}
}