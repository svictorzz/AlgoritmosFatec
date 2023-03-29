package listas.lista02;

import java.util.Scanner;

/*
 Faca um programa para verificar se um determinado numero inteiro e divisıvel por 3 ou
5, mas nao simultaneamente pelos dois.
 */
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = input.nextInt();

        double resto3 = numero % 3;
        double resto5 = numero % 5;

        if (resto3 == 0 && resto5 == 0) {
            System.out.println(numero + " é divisivel por 3 e por 5 simultaneamenre.");
        } else if (resto3 == 0) {
            System.out.println(numero + " é divisivel por 3");
        } else if (resto5 == 0 ) {
            System.out.println(numero + " é divisível por 5");
        } else {
            System.out.println(numero + " não é divisível por 3 nem por 5.");
        }

        input.close();
    }
}
