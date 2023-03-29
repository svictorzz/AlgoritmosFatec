package listas.lista02;
/*
Faca um programa que mostre ao usuario um menu com 4 opcoes de operacoes matematicas 
(as basicas, por exemplo). O usuario escolhe uma das opcoes e o seu programa
entao pede dois valores numericos e realiza a operacao, mostrando o resultado e
saindo.
 */
import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a operação:\n(+),(-),(x),(/) ");
        char operacao = input.next().charAt(0);

        System.out.println("Digite o primeiro numero: ");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = input.nextDouble();

        switch (operacao) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
            case 'x':
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
        
            default:
                System.out.println("Digite uma operação válida.");
                break;
        }

        input.close();

    }
}
