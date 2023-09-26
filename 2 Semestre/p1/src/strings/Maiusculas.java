package strings;

import java.util.Scanner;

public class Maiusculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        String maiusculas = nome.toUpperCase();
        System.out.println("Em maiusculas: " + maiusculas);

        sc.close();
    }
}
