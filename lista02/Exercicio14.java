package listas.lista02;
/*
 A nota final de um estudante e calculada a partir de tres notas atribuıdas entre o intervalo
de 0 ate 10, respectivamente, a um trabalho de laboratorio, a uma avaliacao semestral 
e a um exame final. A media das tres notas mencionadas anteriormente obedece aos
pesos: Trabalho de Laboratorio: 2; Avaliacao Semestral: 3; Exame Final: 5. De acordo 
com o resultado, mostre na tela se o aluno esta reprovado (media entre 0 e 2,9), de 
recuperacao (entre 3 e 4,9) ou se foi aprovado. Faca todas as verificacoes necessarias.
 */
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratorio (0 - 10): ");
        double notaLab = input.nextDouble();

        System.out.println("Digite a nota da avaliacao semestral (0 - 10): ");
        double notaSem = input.nextDouble();

        System.out.println("Digite a nota do exame (0 - 10): ");
        double notaFinal = input.nextDouble();

        double media = (notaLab * 2 + notaSem * 3 + notaFinal * 5) / 10;

        if (media >= 0 && media < 3) {
            System.out.println("Aluno reprovado com média " + media);
        } else if (media >= 3 && media < 5) {
            System.out.println("Aluno em recuperação com média " + media);
        } else if (media >= 5 && media <= 10) {
            System.out.println("Aluno aprovado com média " + media);
        } else {
            System.out.println("Média inválida!");
        }

        input.close();

    }
}
