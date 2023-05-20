/*
 Faça um programa que leia um vetor de 10 posições e verifique se existem valores iguais
e os escreva na tela.
 */

package listas.lista04;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[10];
        boolean repetidoEncontrado = false;

        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Posição " + i + ": ");
            v[i] = scanner.nextInt();
        }

        System.out.println("Valores repetidos: ");
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    repetidoEncontrado = true;
                    System.out.println(v[i]);
                }
            }
        }

        if (!repetidoEncontrado) {
            System.out.println("Nenhum valor repetido encontrado.");
        }

        scanner.close();
    }
}
