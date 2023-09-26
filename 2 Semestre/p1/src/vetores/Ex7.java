package vetores;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int cont = 0;

        System.out.println("Insira os valores do vetor: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Insira o valor da posição " + i + ": ");
            int num = sc.nextInt();

            if (num % 5 == 0){
                vet[i] = num;
            } else {
                System.out.println("O numero digitado tem que ser divisível por 5.");
                cont++;
                i--;
            }
        }

        System.out.println();
        System.out.println("Vetor A:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "|");
        }

        System.out.println();
        System.out.println("Numeros não divisíveis por 5 digitados: " + cont);
        
        sc.close();
    }
}
