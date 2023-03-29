package listas.lista01;
/*
 Faca um programa para converter uma letra maiuscula em letra minuscula. Use a tabela 
ASCII para resolver o problema.
 */
import java.util.Scanner;
public class Exercicio45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma letra maiuscula: ");
        char letraMaiuscula = entrada.nextLine().charAt(0);

        int tabelaAsciiMaiuscula = (int) letraMaiuscula;
        int tabelaAsciiMinuscula = tabelaAsciiMaiuscula + 32;

        char letraMinuscula = (char) tabelaAsciiMinuscula;
        System.out.println("A letra correspondente em minuscula e: " + letraMinuscula);

        
        entrada.close();
    
    }

}