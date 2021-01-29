package mz.co.cmm.principal;

import java.util.Arrays;
import java.util.Scanner;

import mz.co.cmm.entidade.Aluguer;

public class ExecutarAluguer {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Aluguer [] quartos = new Aluguer[10];
		
		System.out.println("Quantos estudantes vao alugar quartos?");
		int N = teclado.nextInt();
		
		if (N>=1 && N<=10) {
			
		for (int i = 0; i < N; i++) {
			teclado.nextLine();
			
			System.out.println("Digite o nome do estudante:");
			String estudante = teclado.nextLine();
			
			
			System.out.println("Digite o numero de celular:");
			int celular = teclado.nextInt();
			
			System.out.println("Digite o quarto desejado:");
			int numeroQuarto = teclado.nextInt();
			
			if (numeroQuarto>=0 && numeroQuarto<=9) {
				
				quartos[i] = new Aluguer(estudante, celular, numeroQuarto);
				
			}
			
			else {
				System.out.println("Escolha quartos de 0 a 9");
			}
		
			
		   }
		}
		
		
		System.out.println("Quartos alugados:");	
		for (int i = 0; i < N; i++) {
		
		System.out.println(quartos[i]);
			
		}
		
		teclado.close();

	}

}
