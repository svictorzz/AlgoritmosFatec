package application;

import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            String input = scanner.nextLine();
            int num = converterParaInteiro(input);
            System.out.println("Número digitado: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Formato de número inválido.");
        } finally {
            scanner.close();
            System.out.println("Programa encerrado.");
        }
    }

    public static int converterParaInteiro(String texto) throws NumberFormatException {
        if (!texto.matches("\\d+")) {
            throw new NumberFormatException("Formato de número inválido.");
        }
        return Integer.parseInt(texto);
    }
}