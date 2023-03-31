package listas.lista02;

import java.util.Scanner;

/*
 Faça um algoritmo que calcule o IMC de uma pessoa e mostre sua classificação de 
acordo com a tabela abaixo:

IMC             Classificação
< 18,5          Abaixo do Peso
18,6 - 24,9     Saudável
25,0 - 29,9     Peso em excesso
30,0 - 34,9     Obesidade Grau I
35,0 - 39,9     Obesidade Grau II(severa)
≥ 40,0          Obesidade Grau III(morbida)
 */
public class Exercicio41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o peso (em Kg): ");
        double peso = input.nextDouble();

        System.out.println("Insira a altura (em m): ");
        double h = input.nextDouble();

        double imc = peso/(h * h);
        System.out.printf("Seu IMC é: %.2f\n", imc);
       
        if (imc <= 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Saudável.");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Peso em excesso.");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I.");
        } else if (imc <= 39.9) {
            System.out.println("Classificação:Obesidade Grau II(severa).");
        } else if (imc >= 40) {
            System.out.println("Classificação: Obesidade Grau III(morbida).");
        } else{
            System.out.println("Insira valores válidos.");
        }

        input.close();
    }
}
