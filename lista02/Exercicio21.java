package listas.lista02;

import java.util.Scanner;

/*
 Escreva o menu de opcoes abaixo. Leia a opcao do usuario e execute a operacao escolhida.
 Escreva uma mensagem de erro se a opcao for invalida. 

Escolha a opcao:
1- Soma de 2 numeros.
2- Diferenca entre 2 numeros (maior pelo menor).
3- Produto entre 2 numeros.
4- Divisao entre 2 numeros (o denominador nao pode ser zero).
Opcao

 */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a opção:\n"
        + "1- Soma de 2 numeros. \n"
        + "2- Diferenca entre 2 numeros (maior pelo menor).\n"
        + "3- Produto entre 2 numeros.\n"
        + "4- Divisao entre 2 numeros (o denominador nao pode ser zero).\nOpcao");

        int opcao = input.nextInt();

        System.out.println("Digite o primeiro numero: ");
        double num1 = input.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        double num2 = input.nextDouble();

        switch(opcao) {
           
            case 1: 
                double soma = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + soma);
                break;
            case 2: 
                if (num1 > num2) {
                    System.out.println("A diferença entre o maior e o menor é: " + (num1 - num2));
                } else if (num2 > num1){
                    System.out.println("A diferença entre o maior e o menor é: " + (num2 - num1));
                } else {
                    System.out.println("Os numeros são iguais.");
                }
                break;
            case 3: 
                double multi = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + multi);
                break;
            case 4: 
                double divisao = num1 / num2;
                if (num2 == 0) {
                    System.out.println("O denominador nao pode ser zero.");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + divisao);
                }
                break;
            default:
                System.out.println("Opção inválida.");   
        }

        input.close();
    }

}
