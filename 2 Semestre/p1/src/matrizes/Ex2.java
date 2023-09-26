package matrizes;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] matA = new int[2][2];
        int [][] matB = new int[2][2];
        int [][] matC = new int[2][2];

        System.out.println("Insira os valores da matriz A: ");
        for (int i = 0; i < matA.length; i++){
            for (int j = 0; j < matA[i].length; j++){
                matA[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Insira os valores da matriz B: ");
        for (int i = 0; i < matB.length; i++){
            for (int j = 0; j < matB[i].length; j++){
                matB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matC.length; i++){
            for (int j = 0; j < matC[i].length; j++){
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }

        System.out.println();
        System.out.println("Matriz C:");

        for (int i = 0; i < matC.length; i++) {
            for (int j = 0; j < matC[i].length; j++) {
                System.out.print(matC[i][j] + " | ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
