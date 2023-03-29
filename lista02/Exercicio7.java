package listas.lista02;
import java.util.Scanner;
/* 
Faca um programa que receba dois numeros e mostre o maior. Se por acaso, os dois 
numeros forem iguais, imprima a mensagem  Numeros iguais.
 */
public class Exercicio7 {
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
