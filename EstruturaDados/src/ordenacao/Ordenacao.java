package ordenacao;

import java.util.Date;
import java.util.Scanner;

import ordenacao.NossoVetor;

public class Ordenacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		NossoVetor vetor;


		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		while (n > 0) {
			vetor = new NossoVetor(n);
			vetor.preencheVetor();
			System.out.println("1o vetor gerado \n" + vetor);

			Long inicio = new Date().getTime();
			vetor.selectionSort();
			Long fim = new Date().getTime();
			System.out.println("Vetor ordenado pelo selection \n" + vetor);
			System.out.println("Selection demorou " + (fim - inicio) + " ms" );

			vetor.esvaziaVetor();
			vetor.preencheVetor();
			System.out.println("2o vetor gerado \n" + vetor);

			Long inicio2 = new Date().getTime();
			vetor.insertionSort();
			Long fim2 = new Date().getTime();
			System.out.println("Vetor ordenado pelo insertion \n" + vetor);
			System.out.println("Insertion demorou " + (fim2 - inicio2) + " ms" );

			vetor.esvaziaVetor();
			vetor.preencheVetor();
			System.out.println("3o vetor gerado \n" + vetor);

			Long inicio3 = new Date().getTime();
			vetor.bubbleSort();
			Long fim3 = new Date().getTime();
			System.out.println("Vetor ordenado pelo bubble \n" + vetor);
			System.out.println("Bubble demorou " + (fim3 - inicio3) + " ms" );

			vetor.esvaziaVetor();
			vetor.preencheVetor();
			System.out.println("4o vetor gerado \n" + vetor);

			Long inicio4 = new Date().getTime();
			vetor.quickSort(0, n-1);
			Long fim4 = new Date().getTime();
			System.out.println("Vetor ordenado pelo quick \n" + vetor);
			System.out.println("Quick demorou " + (fim4 - inicio4) + " ms" );
			
			System.out.println("Digite o tamanho do vetor, 0 encerra: ");
			n = sc.nextInt();
		}
		
		sc.close();
	}
}
