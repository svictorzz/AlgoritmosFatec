package listas.lista02;

import java.util.Scanner;

/*
 Escreva um programa que, dado o valor da venda, imprima a comissao que deverá ser 
paga ao vendedor. Para calcular a comissão, considere a tabela abaixo:

Venda mensal                                                        Comissão
Maior ou igual a R$100.000,00                                R$700,00 + 16% das vendas
Menor que R$100.000,00 e maior ou igual a R$80.000,00        R$650,00 +14% das vendas
Menor que R$80.000,00 e maior ou igual a R$60.000,00         R$600,00 +14% das vendas
Menor que R$60.000,00 e maior ou igual a R$40.000,00         R$550,00 +14% das vendas
Menor que R$40.000,00 e maior ou igual a R$20.000,00         R$500,00 +14% das vendas
Menor que R$20.000,00                                        R$400,00 +14% das vendas
 */
public class Exercicio36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da venda em R$: ");
        double valorVenda = input.nextDouble();

        double comissao = 0;

        if (valorVenda >= 100.000) {
            comissao = 700 + (valorVenda * 0.16);
            System.out.println("A comissão é de: R$" + comissao);
        } else if (valorVenda < 100.000 && valorVenda >= 80.000) {
            comissao = 650 + (valorVenda * 0.14);
            System.out.println("A comissão é de: R$" + comissao);
        } else if (valorVenda < 80.000 && valorVenda >= 60.000) {
            comissao = 600 + (valorVenda * 0.14);
            System.out.println("A comissão é de: R$" + comissao);
        } else if (valorVenda < 60.000 && valorVenda >= 40.000) {
            comissao = 550 + (valorVenda * 0.14);
            System.out.println("A comissão é de: R$" + comissao);
        } else if (valorVenda < 40.000 && valorVenda >= 20.000) {
            comissao = 500 + (valorVenda * 0.14);
            System.out.println("A comissão é de: R$" + comissao);
        } else if (valorVenda < 20.000 && valorVenda >= 1){
            comissao = 400 + (valorVenda * 0.14);
            System.out.println("A comissão é de: R$" + comissao);
        } else {
            System.out.println("Não há comissão.");
        }

        input.close();
    }
}
