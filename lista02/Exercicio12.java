package listas.lista02;
import java.util.Scanner;
/*
 Ler um numero inteiro. Se o numero lido for negativo, escreva a mensagem “Numero 
invalido”. Se o numero for positivo, calcular o logaritmo deste numero.
 */

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Numero invalido");
        } else {
            double logaritmo = Math.log(numero);
            System.out.println("O logaritmo de " + numero + " e " + logaritmo);
        }

        input.close();
    }    

    
}
