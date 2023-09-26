package vetores;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[15];
        int[] vetB = new int[15];

        System.out.println("Insira os valores do vetor:");
        for(int i = 0; i < vetA.length; i++){
            System.out.print("Insira o valor da posição " + i + ": ");
            vetA[i] = sc.nextInt();
        }

        for(int i = 0; i < vetB.length; i++){
            vetB[i] = vetA[i] * 3;
        }

        System.out.println();
        System.out.print("Vetor multiplicado: ");
        for(int i = 0; i < vetB. length; i++){
            System.out.print(vetB[i] + "|");
        }


        sc.close();
    }
}
