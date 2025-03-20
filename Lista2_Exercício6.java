package Java7_2_19_03;

import java.util.Scanner;

public class Lista2_Exercício6 {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		String nomeDoColaborador;
		int cargoDoColaborador;
		double reajuste;
		float salario,novo_salarioReajustado;
		
		System.out.println("Digite o nome do colaborador:");
		nomeDoColaborador = lerScanner.nextLine();
		
		System.out.println("Digite o cargo do colaborador:");
		cargoDoColaborador = lerScanner.nextInt();
		
		System.out.println("Digite o salário");
		salario = lerScanner.nextFloat();
		
		System.out.println("Digite o reajuste");
		reajuste = lerScanner.nextFloat();
		
	    System.out.println("esse é seu novo salário:" + (salario + (reajuste * salario)));
	}    

}
