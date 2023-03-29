package listas.lista02;

import java.util.Scanner;

/*
 Faca um programa que leia um numero e, caso ele seja positivo, calcule e mostre: 
• O numero digitado ao quadrado 
• A raiz quadrada do numero digitado
 */
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = entrada.nextDouble();

        if (numero > 0) {
            System.out.println("\nQuadrado: " + (numero * numero) +
             "\nRaiz quadrada: " + Math.sqrt(numero));
        } else {
            System.out.println("Eu odeio o Corinthians.");
        }

        entrada.close();
    }
}
