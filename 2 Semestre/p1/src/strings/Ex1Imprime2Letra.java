package strings;

import java.util.Scanner;

public class Ex1Imprime2Letra {
    public static void main(String[] args) {

        /*
        Escreva um programa que leia duas strings (dois nomes)
        e as imprima na tela. Imprima também a segunda letra
        de cada string.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite o segundo nome: ");
        String nome2 = sc.nextLine();

        System.out.println("Primeiro nome: " + nome1 + ", segunda letra: " + nome1.charAt(1) + "\n"
                + "Segundo nome: " + nome2 + ", segunda letra: " + nome2.charAt(1));

        sc.close();
    }
}
