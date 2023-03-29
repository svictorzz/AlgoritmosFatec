package listas.lista01;

import java.util.Scanner;
public class Exercicio52 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quanto o primeiro amigo investiu em R$: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite quanto o segundo amigo investiu em R$: ");
        double valor2 = sc.nextDouble();

        System.out.println("Digite quanto o terceiro amigo investiu em R$: ");
        double valor3 = sc.nextDouble();

        System.out.println("Digite o valor do premio em R$: ");
        double valorPremio = sc.nextDouble();

        double valorTotalInvestido = valor1 + valor2 + valor3;
        double porcentagemPrimeiro = valor1 / valorTotalInvestido;
        double porcentagemSegundo = valor2 / valorTotalInvestido;
        double porcentagemTerceiro = valor3 / valorTotalInvestido;

        double valorRecebido1 = valorPremio * porcentagemPrimeiro;
        valorRecebido1 = Math.rint (valorRecebido1 * 100.0) / 100.0;

        double valorRecebido2 = valorPremio * porcentagemSegundo;
        valorRecebido2 = Math.rint (valorRecebido2 * 100.0) / 100.0;

        double valorRecebido3 = valorPremio * porcentagemTerceiro;
        valorRecebido3 = Math.rint (valorRecebido3 * 100.0) / 100.0;
 
        System.out.println("O primeiro amigo ira receber R$" + valorRecebido1 + 
        "\nO segundo amigo ira receber R$" + valorRecebido2 + 
        "\nO terceiro amigo ira receber R$" + valorRecebido3);

        sc.close();

    }
}
