package listas.lista02;

import java.util.Scanner;

/*
 Faca um programa que receba um numero inteiro e verifique se este numero e par ou ımpar.
 */
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int numero = entrada.nextInt();
        int resto = numero % 2;

        if (resto == 0) {
            System.out.println("O numero " + numero + " e par.");
        } else {
            System.out.println("O numero " + numero + " e impar.");
        }

        entrada.close();
    }
}
