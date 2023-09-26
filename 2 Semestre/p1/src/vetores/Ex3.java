package vetores;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int[] vet = new int[50];

        System.out.println("Insira os valores do vetor: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Insira o valor da posição " + i + ": ");
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < vet.length; i++){
            if (vet[i] >= maior){
                maior = vet[i];
            }
        }

        System.out.println();
        System.out.println("Maior numero do vetor: " + maior);

        sc.close();
    }
}
