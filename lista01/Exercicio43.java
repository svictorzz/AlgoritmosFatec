package listas.lista01;
import java.util.Scanner;

/*
 Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre:
• o total a pagar com desconto de 10%;
• o valor de cada parcela, no parcelamento de 3× sem juros;
• a comissao do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto)
• a comissao do vendedor, no caso da venda ser parcelada (5% sobre o valor total)
 */
public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valorInicial = sc1.nextDouble();
        double valorDesconto = valorInicial - (valorInicial * 0.10);
        double valorParcela = valorInicial / 3;
        valorParcela = Math.rint (valorParcela * 100.0) / 100.0;  // multiplica por 100, arredonda e divide por 100 de novo
        double comissaoVista = valorDesconto * 0.05;
        double comissaoParcelada = valorInicial * 0.05;

        System.out.println("Valor com 10% de desconto: " + valorDesconto + 
        "\nValor de cada parcela(3x sem juros): " + valorParcela + 
        "\nComissao do vendedor venda a vista: " + comissaoVista + 
        "\nComissao do vendedor venda parcelada: " + comissaoParcelada);

        sc1.close();
    }
}
