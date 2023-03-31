package listas.lista02;

import java.util.Scanner;

/*
 Leia a nota e o numero de faltas de um aluno, e escreva seu conceito. De acordo com a 
tabela abaixo, quando o aluno tem mais de 20 faltas ocorre uma reducao de conceito.

NOTA                CONCEITO(ATE 20 FALTAS)      CONCEITO(MAIS DE 20 FALTAS)
9.0 ate 10.0                 A                              B
7.5 ate 8.9                  B                              C
5.0 ate 7.4                  C                              D
4.0 ate 4.9                  D                              E
0.0 ate 3.9                  E                              E
 */
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota do aluno (0-10)");
        double nota = input.nextDouble();

        System.out.println("Digite o número de faltas: ");
        int faltas = input.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Digite uma nota válida.");
        } else if (nota >= 9 && nota <=10){
            if (faltas <= 20) {
                System.out.println("Conceito: A");
            } else {
                System.out.println("Conceito: B");
            }
        } else if (nota >= 7.5 && nota <= 8.9){
            if (faltas <= 20) {
                System.out.println("Conceito: B");
            } else {
                System.out.println("Conceito: C");
            }
        } else if (nota >= 5 && nota <= 7.4){
            if (faltas <= 20) {
                System.out.println("Conceito: C");
            } else {
                System.out.println("Conceito: D");
            }
        } else if (nota >= 4 && nota <= 4.9){
            if (faltas <= 20) {
                System.out.println("Conceito: D");
            } else {
                System.out.println("Conceito: D");
            }
        } else{
                System.out.println("Conceito: E");
        }

        input.close();
    }
}
