package Metodosll;

import java.util.Scanner;

public class Contagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		
		System.out.println("Digite o numero onde a contagem sera encerrada : ");
		 int fim = sc.nextInt();
		 for (int i = 0; i < fim; i++) {
			 System.out.println(i);
			
		 }
		  System.out.println("Digite o numero onde a contagem comecara : ");
		  int inicio1 = sc.nextInt();
		  System.out.println("Digite o numero onde a contagem se encerrara : ");
		  int fim2 = sc.nextInt();
		  for (int i = inicio1; i <= fim2; i++) {
			  System.out.println(i);
		  }
		  

							
		}

}