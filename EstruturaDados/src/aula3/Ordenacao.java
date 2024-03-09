package aula3;

import java.util.Date;
import java.util.Scanner;

import aula2.NossoVetor;

public class Ordenacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		NossoVetor vetor;
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		while (n > 0) {
			vetor = new NossoVetor(n);
			vetor.preencheVetor();
			
			Long inicio = new Date().getTime();
			vetor.selectionSort();
			Long fim = new Date().getTime();
			System.out.println("n: " + n + ", Selection demorou " + (fim - inicio) + "ms");
			
			System.out.println("Digite o tamanho do vetor, 0 encerra: ");
			n = sc.nextInt();
		}
		
		sc.close();
	}
}
