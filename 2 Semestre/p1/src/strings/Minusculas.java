package strings;

import java.util.Scanner;

public class Minusculas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        String minusculas = nome.toLowerCase();
        System.out.println("Em minusculas: " + minusculas);

        sc.close();
    }
}
