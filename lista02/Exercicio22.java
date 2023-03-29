package listas.lista02;

import java.util.Scanner;

/*
 Leia a idade e o tempo de servico de um trabalhador e escreva se ele pode ou nao se
aposentar. As condicoes para aposentadoria sao
• Ter pelo menos 65 anos,
• Ou ter trabalhado pelo menos 30 anos,
• Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos.
 */
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade do trabalhador: ");
        int idade = input.nextInt();

        System.out.println("Digite o tempo de serviço do trabalhador (em anos): ");
        int anosTrabalhados = input.nextInt();

        if (idade >= 60 && anosTrabalhados >= 25) {
            System.out.println("Pode se aposentar.");
        } else if (anosTrabalhados >= 30){
            System.out.println("Pode se aposentar.");
        } else if (idade >= 65){
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Ainda não pode se aposentar.");
        }

        input.close();
    }
}
