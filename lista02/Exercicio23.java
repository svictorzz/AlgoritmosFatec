package listas.lista02;

import java.util.Scanner;

/* 
 Determine se um determinado ano lido e bissexto. Sendo que um ano e bissexto se
for divisıvel por 400 ou se for divisıvel por 4 e nao for divisıvel por 100. Por exemplo:
1988, 1992, 1996
 */
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano a ser verificado: ");
        int ano = input.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 ) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else if (ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
           System.out.println("O ano " + ano + " não é bissexto.");
        }

        input.close();
    }
}
