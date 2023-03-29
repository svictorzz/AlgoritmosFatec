package listas.lista02;

import java.util.Scanner;

/*
 Faca um algoritmo que calcule a media ponderada das notas de 3 provas. A primeira e
a segunda prova tem peso 1 e a terceira tem peso 2. Ao final, mostrar a media do aluno 
e indicar se o aluno foi aprovado ou reprovado. A nota para aprovacao deve ser igual ou 
superior a 60 pontos.
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a primeira nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a primeira nota: ");
        double nota3 = input.nextDouble();

        double media = ((nota1 + nota2) + (nota3 * 2)) / 4.0;

        if (media >= 60) {
            System.out.println("Media: " + media + "\nAluno aprovado!");
        } else {
            System.out.println("Media: " + media + "\nAluno reprovado!");
        }

        input.close();
    }
}
