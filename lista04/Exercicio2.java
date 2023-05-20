/*
 Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
 */

package listas.lista04;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[6];

        System.out.println("Digite os valores desse vetor: ");
        for (int i = 0; i < 6; i++) {
            System.out.println("Posicao " + i + ":");
            v[i] = scanner.nextInt();
        }

        System.out.println("Valores do vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        scanner.close();
    }
}
