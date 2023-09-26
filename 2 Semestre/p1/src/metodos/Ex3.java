package metodos;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Validar o valor de N
        while (n != 1 && n != 2 && n != 3) {
            System.out.print("Digite o valor de N (1, 2 ou 3): ");
            n = scanner.nextInt();
            if (n != 1 && n != 2 && n != 3) {
                System.out.println("Valor inválido. Digite novamente.");
            }
        }

        if (n == 1) {
            int[] vetA = new int[20];
            for (int i = 0; i < 20; i++) {
                System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
                vetA[i] = scanner.nextInt();
            }
            int resultado = calcularSomaParesDivisiveisPor3(vetA);
            System.out.println("A soma dos números pares e divisíveis por 3 é: " + resultado);
        } else if (n == 2) {
            int[] vetA = new int[15];
            int[] vetB = new int[15];

            for (int i = 0; i < 15; i++) {
                System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
                vetA[i] = scanner.nextInt();
                vetB[i] = calcularSomatorio(vetA, i);
            }

            System.out.println("Vetor A:");
            imprimirVetor(vetA);
            System.out.println("Vetor B:");
            imprimirVetor(vetB);
        } else if (n == 3) {
            int[][] matriz = new int[5][5];

            System.out.println("Digite os elementos da matriz 5x5:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            char resultado = verificarSomaDiagonais(matriz);
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }

    public static int calcularSomaParesDivisiveisPor3(int[] vetor) {
        int soma = 0;
        for (int num : vetor) {
            if (num % 2 == 0 && num % 3 == 0) {
                soma += num;
            }
        }
        return soma;
    }

    public static int calcularSomatorio(int[] vetor, int indice) {
        int somatorio = 0;
        for (int i = 0; i <= indice; i++) {
            somatorio += vetor[i];
        }
        return somatorio;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static char verificarSomaDiagonais(int[][] matriz) {
        int somaP = 0;
        int somaS = 0;

        for (int i = 0; i < matriz.length; i++) {
            somaP += matriz[i][i];
            somaS += matriz[i][matriz.length - 1 - i];
        }

        if (somaP % 2 != 0 && somaS % 2 == 0 && somaS % 3 == 0) {
            return 'V';
        } else {
            return 'F';
        }
    }
}
