package vetores;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[20];
        int[] vetB = new int[20];

        int tamanho = vetA.length;

        System.out.println("Insira os valores do vetor A: ");
        for (int i = 0; i < vetA.length; i++){
            System.out.println("Insira o valor da posição " + i + ": ");
            vetA[i] = sc.nextInt();
        }

        System.out.println("Insira os valores do vetor B: ");
        for (int i = 0; i < vetB.length; i++){
            System.out.println("Insira o valor da posição " + i + ": ");
            vetB[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Vetor A antes da troca: ");
        for(int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + "|");
        }

        System.out.println();
        System.out.println("Vetor B antes da troca: ");
        for(int i = 0; i < vetB.length; i++){
            System.out.print(vetB[i] + "|");
        }

        // trocando as posições

        for (int i = 0; i < vetA.length; i++) {
            int aux;
            aux = vetA[i];
            vetA[i] = vetB[tamanho - 1];
            vetB[tamanho - 1] = aux;

            tamanho--;
        }

        System.out.println();
        System.out.println();
        System.out.println("Vetor A depois da troca: ");
        for(int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + "|");
        }

        System.out.println();
        System.out.println("Vetor B depois da troca: ");
        for(int i = 0; i < vetB.length; i++){
            System.out.print(vetB[i] + "|");
        }



        sc.close();
    }
}
