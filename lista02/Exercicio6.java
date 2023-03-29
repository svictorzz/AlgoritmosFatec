package listas.lista02;
import java.util.Scanner;
/* 
 Escreva um programa que, dados dois numeros inteiros, mostre na tela o maior deles, 
assim como a diferenca existente entre ambos.
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " e o maior numero, a diferenca e de: " + (num1 - num2));
        } else if(num2 > num1) {
            System.out.println(num2 + " e o maior numero, a diferenca e de: " + (num2 - num1));
        }
        else{
            System.out.println("Os dois numeros sao iguais.");
        }
        entrada.close();
    }
}
