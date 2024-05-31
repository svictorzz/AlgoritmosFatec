package p1;

import java.util.Date;
import java.util.Scanner;

public class Ordenap1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        MeuVetor v;
        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        while (n > 0){
            v = new MeuVetor(n);
            v.preencheVetor();
            System.out.println("1o vetor gerado: \n" + v);

            Long inicio = new Date().getTime();
            v.selectionSort();
            Long fim = new Date().getTime();
            System.out.println("Vetor ordenado pelo selection \n" + v);
            System.out.println("Selection demorou " + (fim - inicio) + " ms" );

            v.esvaziaVetor();
            v.preencheVetor();
            System.out.println("2o vetor gerado \n" + v);

            Long inicio2 = new Date().getTime();
            v.insertionSort();
            Long fim2 = new Date().getTime();
            System.out.println("Vetor ordenado pelo insertion \n" + v);
            System.out.println("Insertion demorou " + (fim2 - inicio2) + " ms" );

            v.esvaziaVetor();
            v.preencheVetor();
            System.out.println("3o vetor gerado \n" + v);

            Long inicio3 = new Date().getTime();
            v.bubbleSort();
            Long fim3 = new Date().getTime();
            System.out.println("Vetor ordenado pelo bubble \n" + v);
            System.out.println("Bubble demorou " + (fim3 - inicio3) + " ms" );


            System.out.println("Digite o tamanho do vetor, 0 encerra: ");
            n = sc.nextInt();
        }

        sc.close();
    }
}
