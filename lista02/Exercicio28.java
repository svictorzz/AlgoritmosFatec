package listas.lista02;
/*
 Faca um programa que leia tres numeros inteiros positivos e efetue o calculo de uma das 
seguintes medias de acordo com um valor numerico digitado pelo usuario:

(a) Geometrica: √3 x ∗ y ∗ z
(b) Ponderada: x+2∗y+3∗z/6
(c) Harmonica: (1/(1/x) + (1/y) + (1/z)
(d) Aritmetica: (x+y+z)/3
 */
import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int x = input.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int y = input.nextInt();

        System.out.println("Digite o terceiro numero inteiro: ");
        int z = input.nextInt();

        System.out.println("Escola uma opção de media: " + "\n(a) Geometrica" + "\n(b) Ponderada" + "\n(c) Harmonica" + "\n(d) Aritmetica");
        char opcao = input.next().charAt(0);

        switch (opcao) {
            case 'a':
            case 'A':
                double geometrica = Math.cbrt((x * y * z));
                System.out.println("A média geométrica é: " + geometrica);
                break;
            case 'b':
            case 'B':
                double ponderada = (x + 2 * y + 3 * z)/6;
                System.out.println("A média ponderada é: " + ponderada);
                break;
            case 'c':
            case 'C':
                double harmonica = 1/((1/x) + (1/y) + (1/z));
                System.out.println("A média harmônica é: " + harmonica);
                break;
            case 'd':
            case 'D':   
                double aritmetica = (x + y + z) / 3;
                System.out.println("A média aritmética é: " + aritmetica);                
                break;
            default:
                System.out.println("Digite uma opção valida.");
                break;
        }

        input.close();
    }
}
