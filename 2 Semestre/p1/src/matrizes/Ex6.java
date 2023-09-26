package matrizes;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int diagonal = 3;
        int outros = 0;
        int somaDiagonal = 0;
        int somaOutros = 0;


        System.out.println("Insira os valores da matriz (0 - 1): ");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.println("Insira o valor da posição [" + i + "][" + j + "]: ");
                int n = sc.nextInt();

                if(n >= 0 && n <= 1){
                    mat[i][j] = n;
                } else {
                    System.out.println("A matriz aceita apenas os valores 0 e 1. Digite novamente");
                    j--;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j){
                    somaDiagonal += mat[i][j];
                } else {
                    somaOutros += mat[i][j];
                }
            }
        }

        System.out.println("Matriz: ");

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " | ");
            }
            System.out.println();
        }

        if (somaDiagonal == diagonal && somaOutros == outros){
            System.out.println("Matriz identidade.");
        } else {
            System.out.println("Matriz não identidade.");
        }

        sc.close();
    }
}
