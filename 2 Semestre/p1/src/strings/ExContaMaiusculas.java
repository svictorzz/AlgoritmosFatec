package strings;
import java.util.Scanner;

public class ExContaMaiusculas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int cont = 0;

        for (int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if (letra >= 'A' && letra <= 'Z'){
                cont++;
            }
        }

        System.out.println("Maiusculas: " + cont);

        sc.close();
    }
}
