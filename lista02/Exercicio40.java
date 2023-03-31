package listas.lista02;
/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica, da comissão
do distribuidor, e dos impostos. A comissao e os impostos são calculados sobre o custo 
de fábrica, de acordo com a tabela abaixo. Leia o custo de fábrica e escreva o custo ao
consumidor.
CUSTO DE FABRICA                % DO DISTRIBUIDOR      % DOS IMPOSTOS
ate R$12.000,00                         5                  isento
entre R$12.000,00 e 25.000,00           10                  15
acima de R$25.000,00                    15                  20
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Locale localeBR = new Locale("pt","BR");

        System.out.println("Digite o custo de fábrica (em R$): ");
        double custoFabrica = input.nextDouble();

        double custoFinal;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        if (custoFabrica < 0) {
            System.out.println("Digite um valor válido.");
        } else if (custoFabrica < 12000){
            custoFinal = custoFabrica + (custoFabrica * 0.05);
            System.out.println("O custo final ao consumidor é: " + dinheiro.format(custoFinal));
        } else if (custoFabrica >= 12000 && custoFabrica <= 25000){
            custoFinal = custoFabrica + (custoFabrica * 0.1) + (custoFabrica * 0.15);
            System.out.println("O custo final ao consumidor é: " + dinheiro.format(custoFinal));
        } else if (custoFabrica > 25000){
            custoFinal = custoFabrica + (custoFabrica * 0.15) + (custoFabrica * 0.2);
            System.out.println("O custo final ao consumidor é: " + dinheiro.format(custoFinal));
        } 

        input.close();
    }
}
