package matrizes;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[5][5];

        System.out.println("Insira os dados da matriz: ");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.println("Insira o valor da posição [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j){
                    System.out.print(mat[i][j] + " | ");
                } else {
                    System.out.print("  |  ");
                }
            }
            System.out.println();
        }

        System.out.println("Diagonal secundaria: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i + j == mat.length - 1){
                    System.out.print(mat[i][j] + " | ");
                } else {
                    System.out.print("  |  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
