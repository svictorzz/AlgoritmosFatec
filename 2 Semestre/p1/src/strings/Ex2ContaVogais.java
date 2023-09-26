package strings;

import java.util.Scanner;

public class Ex2ContaVogais {
    public static void main(String[] args) {
        /*
          Crie um programa para ler o primeiro nome de uma
          pessoa e contar quantas vogais esse nome possui.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro nome: ");
        String nome = sc.next();

        int contaVogais = 0;

        for(int i = 0; i < nome.length(); i++){
            char letra = nome.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contaVogais++;
            }
        }

        System.out.println("Numero de vogais no nome " + nome + ": " + contaVogais);

        sc.close();
    }
}
