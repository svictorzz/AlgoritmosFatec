package listas.lista02;

import java.util.Scanner;

/*
 Leia um numero real. Se o numero for positivo imprima a raiz quadrada. Do contrario,
imprima o numero ao quadrado.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero real: ");
        double numero = entrada.nextDouble();

        if (numero > 0) {
            System.out.println("A raiz quadrada de " + numero + " e: " + Math.sqrt(numero));
        } else {
            System.out.println(numero + " ^2 = " + (numero * numero));
        }

        entrada.close();
    }
}
