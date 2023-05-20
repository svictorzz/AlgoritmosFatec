/*
Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule
e imprima a media geral. 
 */
package listas.lista04;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[15];
        int media = 0;

        System.out.println("Digite as notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Posição " + i + ": ");
            notas[i] = scanner.nextInt();
        }

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        
        System.out.println(" A media dos alunos foi de: " + (media/notas.length));
        
        scanner.close();
    }
}
