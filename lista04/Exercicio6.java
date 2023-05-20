/*
 Faça um programa que receba do usuario um vetor com 10 posições. Em seguida devera
ser impresso o maior e o menor elemento do vetor.
 */

package listas.lista04;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[10];
        int maior;
        int menor;

        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Posição: " + i + ":");
            v[i] = scanner.nextInt();
        }

        maior = v[0];
        menor = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] >= maior) {
                maior = v[i];
            } else if (v[i] <= menor){
                menor = v[i];
            }
        }

        System.out.println("Maior: " + maior + "\nMenor: " + menor);

        scanner.close();
    }
}
