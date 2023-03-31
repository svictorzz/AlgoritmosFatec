package listas.lista02;
/*
 Escrever um programa que leia o codigo do produto escolhido do cardapio de uma lan- 
chonete e a quantidade. O programa deve calcular o valor a ser pago por aquele lanche.
Considere que a cada execucao somente será calculado um pedido. O cardapio da lan-
chonete segue o padrao abaixo: 

Especificação      Código      Preço
Cachorro Quente     100        1.20
Bauru Simples       101        1.30
Bauru com Ovo       102        1.50
Hamburguer          103        1.20
Cheeseburguer       104        1.70
Suco                105        2.20
Refrigerante        106        1.00
 */
import java.util.Scanner;
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = input.nextInt();

        System.out.println("Digite a quantidade que você quer comprar (mínimo 1x): ");
        int qtdItems = input.nextInt();

        double preco = 0;

        switch (codigo) {
            case 100:
                preco = 1.20;
                System.out.println("O valor de " + qtdItems + "x desse produto é R$" + preco * qtdItems);
                break;
            case 101:
                preco = 1.30;
                System.out.println("O valor de " + qtdItems + "x desse produto é R$" + preco * qtdItems);
                break;
            case 102:
                preco = 1.50;
                System.out.println("O valor de " + qtdItems + "x desse produto é R$" + preco * qtdItems);
                break;
            case 103:
                preco = 1.20;
                System.out.println("O valor de " + qtdItems + "x desse produto é R$" + preco * qtdItems);
                break;
            case 104:
                preco = 1.70;
                System.out.println("O valor de " + qtdItems + "x desse produto é R$" + preco * qtdItems);
                break;
            case 105:
                preco = 2.20;
                System.out.println("O valor de " + qtdItems + "x desse produto é R$" + preco * qtdItems);
                break;
            case 106:
                preco = 1.00;
                System.out.println("O valor de " + qtdItems + "x desse produto é R$" + preco * qtdItems);
                break;
        
            default:
                System.out.println("Digite um código válido.");
                break;
        }
        input.close();
    }
}
