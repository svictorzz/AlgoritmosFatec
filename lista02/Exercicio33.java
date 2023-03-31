package listas.lista02;

import java.util.Scanner;

/*
 Um produto vai sofrer aumento de acordo com a tabela abaixo. Leia o preco antigo,
calcule e escreva o preco novo, e escreva uma mensagem em funcao do preco novo (de
acordo com a segunda tabela).
PRECO ANTIGO            PERCENTUAL DE AUMENTO
ate R$ 50                   5%
entre R$ 50 e R$ 100        10%
acima de R$ 100             15%
 */
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço antigo do produto (em R$): ");
        double precoAntigo = input.nextDouble();

        double precoNovo;

        if (precoAntigo < 50) {
            precoNovo = precoAntigo + (precoAntigo * 0.05);
            System.out.println("O produto sofreu um aumento de 5%, o seu novo preço é de R$" + precoNovo);
        } else if (precoAntigo >= 50 && precoAntigo <=100) {
            precoNovo = precoAntigo + (precoAntigo * 0.1);
            System.out.println("O produto sofreu um aumento de 10%, o seu novo preço é de R$" + precoNovo);
        } else {
            precoNovo = precoAntigo + (precoAntigo * 0.15);
            System.out.println("O produto sofreu um aumento de 15%, o seu novo preço é de R$" + precoNovo);
        }

        input.close();
    }
}
