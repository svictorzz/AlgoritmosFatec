package strings;

import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;

        for (char caractere : frase.toCharArray()) {
            switch (caractere) {
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;
            }
        }

        System.out.println("Histograma:");
        System.out.println("a: " + repetirCaracter('*', contA) + " (" + contA + ")");
        System.out.println("e: " + repetirCaracter('*', contE) + " (" + contE + ")");
        System.out.println("i: " + repetirCaracter('*', contI) + " (" + contI + ")");
        System.out.println("o: " + repetirCaracter('*', contO) + " (" + contO + ")");
        System.out.println("u: " + repetirCaracter('*', contU) + " (" + contU + ")");
    }

    public static String repetirCaracter(char caractere, int vezes) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < vezes; i++) {
            resultado.append(caractere);
        }
        return resultado.toString();
    }
}