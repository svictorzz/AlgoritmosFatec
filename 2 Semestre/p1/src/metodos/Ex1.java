package metodos;

import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor A(4 dígitos): ");
        int a = sc.nextInt();

        System.out.println("Insira o valor B(2 dígitos): ");
        int b = sc.nextInt();

        encaixa(a, b);
        System.out.println(a % 100);

        sc.close();
    }

    public static void encaixa(int a, int b){
        if (a % 100 == b){
            System.out.println("Encaixa");
        } else {
            System.out.println("Não encaixa");
        }
    }
}
