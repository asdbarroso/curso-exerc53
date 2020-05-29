package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Alunos;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Alunos aluno = new Alunos();
		
		System.out.println("Nome: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Informe a primeira nota: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.println("Informe a segundo nota: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		aluno.nota3 = sc.nextDouble();

		System.out.printf("Total Nota: %.2f%n", aluno.totalNotas());
		
		aluno.situacaoAluno();
	}

}
