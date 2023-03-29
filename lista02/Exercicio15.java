package listas.lista02;
/*
 Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia
da semana correspondente a este numero. Isto e, domingo se 1, segunda-feira se 2, e
assim por diante.
 */
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro entre 1-7: ");
        int numero = input.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Digite um numero válido!");
                break;
        }

        input.close();

    }
}
