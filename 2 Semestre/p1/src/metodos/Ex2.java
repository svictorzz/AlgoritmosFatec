package metodos;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.println("Digite o valor de n: ");
        int n = sc.nextInt();

        double seq = sequencia(a, n);
        System.out.println(seq);

        sc.close();
    }

    public static double sequencia(double a, int n){
        double soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += 1/(i*a);
        }

        return soma;
    }
}
