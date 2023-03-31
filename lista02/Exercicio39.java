package listas.lista02;
/*
 Uma empresa decide dar um aumento aos seus funcionarios de acordo com uma tabela 
que considera o salario atual e o tempo de serviço de cada funcionário. Os funcionários
com menor salario terão um aumento proporcionalmente maior do que os funcionários
com um salario maior, e conforme o tempo de serviço na empresa, cada funcionário irá
receber um bonus adicional de salário. Faça um programa que leia: 
• o valor do salario atual do funcionário; 
• o tempo de serviço desse funcionario na empresa (número de anos de trabalho na 
empresa).
Use as tabelas abaixo para calcular o salario reajustado deste funcionário e imprima o 
valor do salario final reajustado, ou uma mensagem caso o funcionário não tenha direito 
a nenhum aumento.

Salario Atual       Reajuste(%)      Tempo de Serviço    Bonus
Ate 500,00              25%           Abaixo de 1 ano    Sem bonus 
Ate 1000,00             20%           De 1 a 3 anos      100,00
Ate 1500,00             15%           De 4 a 6 anos      200,00
Ate 2000,00             10%           De 7 a 10 anos     300,00
Acima de 2000,00    Sem reajuste      Mais de 10 anos    500,00
 */
import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário atual do funcionário (em R$): ");
        double salarioAtual = input.nextDouble();

        System.out.println("Digite o tempo de serviço do funcionário na empresa (em anos): ");
        int tempoServico = input.nextInt();
        double salarioNovo = 0;

        // salario ate R$500,00
        if (salarioAtual <= 500) {
            salarioNovo = salarioAtual + (0.25 * salarioAtual);
            if (tempoServico < 1) {
                System.out.println("Reajuste de 25%, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 1 && tempoServico <= 3){
                salarioNovo += 100;
                System.out.println("Reajuste de 25%, bonus de R$100,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 4 && tempoServico <= 6){
                salarioNovo += 200;
                System.out.println("Reajuste de 25%, bonus de R$200,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 7 && tempoServico <= 10){
                salarioNovo += 300;
                System.out.println("Reajuste de 25%, bonus de R$300,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico > 10){
                salarioNovo += 500;
                System.out.println("Reajuste de 25%, bonus de R$500,00, novo salario: R$" + salarioNovo);
            }
        } 
        // salario ate R$1000,00
        else if (salarioAtual <= 1000){
            salarioNovo = salarioAtual + (0.2 * salarioAtual);
            if (tempoServico < 1) {
                System.out.println("Reajuste de 20%, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 1 && tempoServico <= 3){
                salarioNovo += 100;
                System.out.println("Reajuste de 20%, bonus de R$100,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 4 && tempoServico <= 6){
                salarioNovo += 200;
                System.out.println("Reajuste de 20%, bonus de R$200,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 7 && tempoServico <= 10){
                salarioNovo += 300;
                System.out.println("Reajuste de 20%, bonus de R$300,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico > 10){
                salarioNovo += 500;
                System.out.println("Reajuste de 20%, bonus de R$500,00, novo salario: R$" + salarioNovo);
            }
        }
        // salario ate R$1500,00
        else if (salarioAtual <= 1500){
            salarioNovo = salarioAtual + (0.15 * salarioAtual);
            if (tempoServico < 1) {
                System.out.println("Reajuste de 15%, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 1 && tempoServico <= 3){
                salarioNovo += 100;
                System.out.println("Reajuste de 15%, bonus de R$100,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 4 && tempoServico <= 6){
                salarioNovo += 200;
                System.out.println("Reajuste de 15%, bonus de R$200,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 7 && tempoServico <= 10){
                salarioNovo += 300;
                System.out.println("Reajuste de 15%, bonus de R$300,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico > 10){
                salarioNovo += 500;
                System.out.println("Reajuste de 15%, bonus de R$500,00, novo salario: R$" + salarioNovo);
            }
        }
        // salario ate R$2000,00
        else if (salarioAtual <= 2000){
            salarioNovo = salarioAtual + (0.10 * salarioAtual);
            if (tempoServico < 1) {
                System.out.println("Reajuste de 10%, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 1 && tempoServico <= 3){
                salarioNovo += 100;
                System.out.println("Reajuste de 10%, bonus de R$100,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 4 && tempoServico <= 6){
                salarioNovo += 200;
                System.out.println("Reajuste de 10%, bonus de R$200,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico >= 7 && tempoServico <= 10){
                salarioNovo += 300;
                System.out.println("Reajuste de 10%, bonus de R$300,00, novo salario: R$" + salarioNovo);
            } else if (tempoServico > 10){
                salarioNovo += 500;
                System.out.println("Reajuste de 10%, bonus de R$500,00, novo salario: R$" + salarioNovo);
            }
        }
        // salario maior que R$2000,00
        else if (salarioAtual > 2000){
            
            if (tempoServico < 1) {
                System.out.println("Sem reajuste, novo salario: R$" + salarioAtual);
            } else if (tempoServico >= 1 && tempoServico <= 3){
                salarioAtual += 100;
                System.out.println("Sem reajuste, bonus de R$100,00, novo salario: R$" + salarioAtual);
            } else if (tempoServico >= 4 && tempoServico <= 6){
                salarioAtual += 200;
                System.out.println("Sem reajuste, bonus de R$200,00, novo salario: R$" + salarioAtual);
            } else if (tempoServico >= 7 && tempoServico <= 10){
                salarioAtual += 300;
                System.out.println("Sem reajuste, bonus de R$300,00, novo salario: R$" + salarioAtual);
            } else if (tempoServico > 10){
                salarioAtual += 500;
                System.out.println("Sem reajuste, bonus de R$500,00, novo salario: R$" + salarioAtual);
            }
        }
        else{
            System.out.println("Digite um salário válido.");
        }

        input.close();
    }
}
