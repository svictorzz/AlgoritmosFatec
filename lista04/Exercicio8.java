/*
 Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos
na ordem inversa.
 */

package listas.lista04;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[6];

        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Posição " + i + ": ");
            v[i] = scanner.nextInt();
        }

        System.out.println("Ordem inversa: ");
        for (int i = v.length - 1; i >=0; i--) {
            System.out.println(v[i]);
        }

        scanner.close();
    }
}
