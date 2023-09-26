package strings;

import java.util.Scanner;

public class ExContaEspacos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int cont = 0;
        for (int i = 0; i < frase.length(); i++){
            char ch = frase.charAt(i);
            if (ch == ' ' ){
                cont++;
            }
        }

        System.out.println(cont);

        sc.close();
    }
}
