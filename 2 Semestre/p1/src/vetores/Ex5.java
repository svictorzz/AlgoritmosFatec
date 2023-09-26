package vetores;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];

        System.out.println("Insira os valores do vetor: ");
        for(int i = 0; i < vet.length; i++){
            System.out.println("Insira o valor da posição " + i + ": ");
            vet[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Valores positivos do vetor: ");

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > 0){
                System.out.print(vet[i] + "|");
            }
        }

        sc.close();
    }
}
