/*
 Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das
componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem
10 elementos cada. Imprimir todos os conjuntos.
 */

package listas.lista04;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        System.out.println("Digite os valores do vetor A(10): ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": ");
            A[i] = scanner.nextInt(); 
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }

        System.out.println("Valores do vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

        System.out.println("Valores do vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

        scanner.close();
    }
}
