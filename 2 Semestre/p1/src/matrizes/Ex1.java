package matrizes;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[4][4];
        int soma = 0;

        System.out.println("Insira os valores da matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Insira o valor da posição [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                soma += mat[i][j];
            }
        }

        System.out.println();
        System.out.println("Soma dos valores da matriz: " + soma);

        sc.close();
    }
}
