package matrizes;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];

        System.out.println("Insira os dados da matriz: ");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.println("Insira o valor da posição [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if ((i + j) % 2 == 0){
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
