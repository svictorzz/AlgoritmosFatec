/*
 Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui.
 */

package listas.lista04;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v[] = new int[10];
        int contadorPares = 0;

        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Posição " + i + ":");
            v[i] = scanner.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                contadorPares ++;
            } 
        }

        System.out.println("O vetor possui " + contadorPares + " numeros pares.");

        scanner.close();
    }
}
