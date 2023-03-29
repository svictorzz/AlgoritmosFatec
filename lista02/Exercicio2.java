package listas.lista02;

import java.util.Scanner;

/*
 Leia um numero fornecido pelo usuario. Se esse numero for positivo, calcule a raiz 
quadrada do numero. Se o numero for negativo, mostre uma mensagem dizendo que o 
numero e invalido.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = entrada.nextDouble();

        if (numero > 0) {
            System.out.println("A raiz quadrada de " + numero + " e: " + Math.sqrt(numero));
        } else {
            System.out.println("Numero invalido.");
        }

        entrada.close();
    }
}
