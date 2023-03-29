package listas.lista02;

import java.util.Scanner;

/*
 Leia o salario de um trabalhador e o valor da prestacao de um emprestimo. Se a
prestacao for maior que 20% do salario imprima: Emprestimo nao concedido, caso
contrario imprima: Emprestimo concedido.
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salario: ");
        double salario = entrada.nextDouble();

        System.out.println("Digite o valor da prestacao: ");
        double prestacao = entrada.nextDouble();

        if (prestacao > (salario * 0.2)) {
            System.out.println("Emprestimo nao concedido.");
        } else {
            System.out.println("Emprestimo concedido.");
        }
        
        entrada.close();
    }
}
