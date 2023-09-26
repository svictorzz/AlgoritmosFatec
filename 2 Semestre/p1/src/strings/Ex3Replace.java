package strings;

import java.util.Scanner;

public class Ex3Replace {
    public static void main(String[] args) {
        /*
        Escreva um programa que leia uma string e substitua
        todos os caracteres ‘a’ da string lida por ‘*’. Informe na tela
        quantos caracteres foram substituidos.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();

        int contReplace = 0;
        texto = texto.toLowerCase();

        char[] caracteres = texto.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == 'a'){
                caracteres[i] = '*';
                contReplace ++;
            }
        }

        texto = new String(caracteres);


        System.out.println("Novo texto: " + texto + ", caracteres substituidos: " + contReplace);

        sc.close();
    }
}
