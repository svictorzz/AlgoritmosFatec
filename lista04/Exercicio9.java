/*
 Crie um programa que le 6 valores inteiros pares e, em seguida, mostre na tela os valores
lidos na ordem inversa.
 */

package listas.lista04;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[6];

        System.out.println("Digite 6 valores inteiros pares: ");

        for (int i = 0; i < v.length; i++) {

            System.out.println("Posição " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                v[i] = numero;
            } else {
                System.out.println("Número inválido!");
                i--;
            }
            
        }

        System.out.println("Ordem inversa: ");
        for (int i = v.length - 1; i >=0; i--) {
            System.out.println(v[i]);
        }

        scanner.close();
    }
}
