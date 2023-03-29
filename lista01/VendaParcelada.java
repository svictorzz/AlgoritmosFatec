package listas.lista01;
import java.util.Scanner;
public class VendaParcelada{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra em R$: ");
        double valorInicial = scanner.nextDouble();

        System.out.println("Digite o numero de parcelas (ate 3x): ");
        int numeroParcelas = scanner.nextInt();

        double valorDescontoVista = valorInicial - (0.10 * valorInicial);
        double valorAcrescido = valorInicial + (0.10 * valorInicial);

        if (numeroParcelas == 1) {
            System.out.println("Você recebeu 10% de desconto, o valor final é de R$" + valorDescontoVista);
        } else if (numeroParcelas == 2){
            System.out.println("Você irá pagar 2 parcelas de R$" + (valorInicial/2));
        }
        else if (numeroParcelas == 3){
            System.out.println("Você irá pagar 10% a mais, o valor final é de R$" + valorAcrescido);
        }
        else{
            System.out.println("Digite um numero valido de parcelas.");
        }

        scanner.close();
    }
}