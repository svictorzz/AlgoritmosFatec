package strings;

import java.util.Scanner;

public class ExNPalavras {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero inteiro n: ");
        int n = sc.nextInt();

        // Consumir a quebra de linha deixada pelo próximo Enter
        sc.nextLine();

        System.out.print("Insira um caractere: ");
        char ch = sc.next().charAt(0);

        sc.nextLine();

        String[] palavrasComALetra = new String[n];

        System.out.println("Digite uma palavra que comece com " + ch + ": ");
        for (int i = 0; i < n; i++){
            String palavra = sc.nextLine();
            if (palavra.startsWith(String.valueOf(ch).toUpperCase()) || palavra.startsWith(String.valueOf(ch))){
                palavrasComALetra[i] = palavra;
            } else {
                System.out.println("A palavra digitada não começa com " + ch);
                i--;
            }
        }

        // Exibir as palavras com a letra
        System.out.println("Palavras que começam com " + ch + ": ");
        for (String palavra : palavrasComALetra) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }

        sc.close();
    }
}