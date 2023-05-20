/*
 Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima
o vetor, o maior elemento e a posição que ele se encontra. 
 */

package listas.lista04;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[10];
        int maior;
        int posicao;

        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Posição " + i + ": ");
            v[i] = scanner.nextInt();
        }

        maior = v[0];
        posicao = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] >= maior) {
                maior = v[i];
                posicao = i;
            }
        }

        System.out.println("Vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        System.out.println("Maior elemento: " + maior + "(" + posicao + ")" );


        scanner.close();
    }
}
