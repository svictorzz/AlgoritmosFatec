package vetores;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[100];
        int soma = 0;

        System.out.println("Insira os valores do vetor: ");
        for (int i = 0; i < vet.length; i++){
            System.out.println("Insira o valor da posição " + i + ": ");
            vet[i] = sc.nextInt();
        }

        for(int i = 0; i < vet.length; i++){
            if(i % 2 != 0){
                soma += vet[i];
            }
        }

        System.out.println();
        System.out.println("Soma dos valores nos indices impares do vetor: " + soma);

        sc.close();
    }
}
