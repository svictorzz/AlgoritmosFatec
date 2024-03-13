package aula3;

import java.util.Date;
import java.util.Scanner;

import aula2.NossoVetor;

public class Ordenacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		NossoVetor vetor;
		NossoVetor vetor2;
		NossoVetor vetor3;

		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		while (n > 0) {
			vetor = new NossoVetor(n);
			vetor2 = new NossoVetor(n);
			vetor3 = new NossoVetor(n);
			vetor.preencheVetor();
			vetor2.preencheVetor();
			vetor3.preencheVetor();
			
			Long inicio = new Date().getTime();
			vetor.selectionSort();
			Long fim = new Date().getTime();
			System.out.println("n: " + n + ", Selection demorou " + (fim - inicio) + "ms " + vetor);

			vetor2.insertionSort();
			System.out.println("Insertion sort: " + vetor2);
			System.out.println("");

			System.out.println("Vetor 3: " + vetor3);
			vetor3.bubbleSort();
			System.out.println("Bubble sort: " + vetor3);
			System.out.println("");

			
			System.out.println("Digite o tamanho do vetor, 0 encerra: ");
			n = sc.nextInt();
		}
		
		sc.close();
	}
}
