/*
 Faça um programa que leia um vetor de 8 posiçoes e, em seguida, leia também dois va-
lores X e Y quaisquer correspondentes a duas posições no vetor. Ao final seu programa
devera escrever a soma dos valores encontrados nas respectivas posições X e Y .
 */

package listas.lista04;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v[] = new int[8];
        int x,y;

        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Posição " + i + ":");
            v[i] = scanner.nextInt();
        }

        System.out.println("Digite o valor de x (0-7): ");
        x = scanner.nextInt();
        
        System.out.println("Digite o valor de y (0-7): ");
        y = scanner.nextInt();

        int soma = v[x] + v[y];

        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
