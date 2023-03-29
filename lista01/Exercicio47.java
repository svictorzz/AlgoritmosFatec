package listas.lista01;
/*
 Leia um numero inteiro de 4 dıgitos (de 1000 a 9999) e imprima 1 dıgito por linha.
 */
import java.util.Scanner;
public class Exercicio47 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro de 1000 ate 9999: ");
        int numeroLido = scanner.nextInt();

        int primeiroDigito = numeroLido % 10;
        int numero2 = numeroLido / 10;

        int segundoDigito = numero2 % 10;
        int numero3 = numero2 / 10;

        int terceiroDigito = numero3 % 10;
        int numero4 = numero3 / 10;
        
        int quartoDigito = numero4 % 10;

        System.out.println("O numero " + numeroLido + " invertido fica: "
        + "\n"+ primeiroDigito +
        "\n"+ segundoDigito +
        "\n"+ terceiroDigito +
        "\n"+ quartoDigito);

        scanner.close();
    }
}
