package Java7_2_19_03;

import java.util.Scanner;

public class Lista1_execício2 {

	private static int resul;

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		float numero1,numero2,numero3,numero4;
		
		System.out.println("digite um número:");
		numero1 = ler.nextFloat();
		
		System.out.println("digite um número:");
		numero2 = ler.nextFloat();
		
		System.out.println("digite um número:");
		numero3 = ler.nextFloat();
		
		System.out.println("digite um número:");
		numero4 = ler.nextFloat();
		
		// calculo de resul
		
		if(resul > 2) {
			System.out.printf("O número 2 é par e positivo! %.1f" , resul); 
			
		}else if(resul < 3) {
			System.out.printf("O número -3 é ímpar e negativo! %.1f" , resul); 
			
		}else if(resul < 2) {
			System.out.printf("O número -2 é par e negativo! %.1f" , resul);
	
		}else if(resul > 3) {
			System.out.printf("\nO número 3 é ímpar e positivo! %.1f" , resul);
			
			}
		}
}


		
	
	
             
              


