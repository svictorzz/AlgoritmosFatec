package listas.lista02;

import java.util.Scanner;

/*
 Faca um programa que receba tres numeros e mostre-os em ordem crescente. 
 */
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int numero1 = input.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero2 = input.nextInt();

        System.out.println("Digite o terceiro numero:");
        int numero3 = input.nextInt();

        int menor, medio, maior;
        
        // encontra o menor número
        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
        } else if (numero2 < numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }
        
        // encontra o maior número
        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
        } else if (numero2 > numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }
        
        // encontra o número do meio
        if (numero1 != menor && numero1 != maior) {
            medio = numero1;
        } else if (numero2 != menor && numero2 != maior) {
            medio = numero2;
        } else {
            medio = numero3;
        }
        
        System.out.println("Em ordem crescente: " + menor + ", " + medio + ", " + maior);

        input.close();

    }
}
