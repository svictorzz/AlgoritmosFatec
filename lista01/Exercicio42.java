package listas.lista01;
/*
Receba o salario-base de um funcionario. Calcule e imprima o salario a receber,
sabendo-se que esse funcionario tem uma gratificacao de 5% sobre o salario-base.
Alem disso, ele paga 7% de imposto sobre o salario-base.
 */
 import java.util.Scanner;


 public class Exercicio42{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário-base do funcionário em R$: ");
        double salarioBase = scanner.nextDouble();
        
        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;
        double salarioReceber = salarioBase + gratificacao - imposto;

        System.out.println("O salário a receber é: R$" + salarioReceber);

        scanner.close();
    }
 }
 