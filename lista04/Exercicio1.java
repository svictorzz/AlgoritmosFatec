/*
 Faça um programa que possua um vetor denominado A que armazene 6 numeros intei-
ros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variavel inteira (simples) a soma entre os valores das posições 
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posicao o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */

package listas.lista04;

public class Exercicio1 {
    public static void main(String[] args) {

        // (a)
        int[] A = {1, 0, 5, -2, -5, 7};

        // (b)
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma = " + soma);

        // (c)
        A[4] = 100;
        
        // (d)
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }
}
