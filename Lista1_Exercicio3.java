package Java7_2_19_03;

import java.util.Scanner;

public class Lista1_Exercicio3 {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		String nomeDoDoador;
		int idadeDoDoador;
		boolean primeiraDoacaoDeSangue;
		
		// camelCase
		
		System.out.println("Digite o nome do doador:");
		nomeDoDoador = lerScanner.nextLine();
		
		System.out.println("Digite a idade do doador:");
		idadeDoDoador = lerScanner.nextInt();
		
		System.out.println("Primeira doação de sangue?");
		primeiraDoacaoDeSangue = lerScanner.nextBoolean();
		
	  
		// calculo de resul
		
		if(idadeDoDoador >= 18 && idadeDoDoador < 60) {
			System.out.println(nomeDoDoador+" esta apta para doar sangue!"); 
			
		}else if (idadeDoDoador >= 60 && idadeDoDoador < 69 && primeiraDoacaoDeSangue == false) {
			System.out.println(nomeDoDoador+" esta apto para doar sangue!");
			
		}else if (idadeDoDoador >= 60 && idadeDoDoador < 69 && primeiraDoacaoDeSangue == true) {
			System.out.println(nomeDoDoador+" não esta apto para doar sangue!");
				
			}else {
				System.out.println(nomeDoDoador+" não esta apto para doar sangue!"); 
				
			}
			}
			
		}
	
