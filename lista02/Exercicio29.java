package listas.lista02;

import java.util.Random;
import java.util.Scanner;

/*
 Faca uma prova de matematica para criancas que estao aprendendo a somar numeros 
inteiros menores do que 100. Escolha numeros aleatorios entre 1 e 100, e mostre na 
tela a pergunta: qual e a soma de a + b, onde a e b sao os numeros aleatorios. Peca a
resposta. Faca cinco perguntas ao aluno, e mostre para ele as perguntas e as respostas
corretas, alem de quantas vezes o aluno acertou. 
 */
public class Exercicio29 {
    public static void main(String[] args) {
        int numQuestions = 5; // quantidade de perguntas na prova
        int acertos = 0; // contador de acertos
        
        Random random = new Random(); // objeto para gerar números aleatórios
        Scanner scanner = new Scanner(System.in); // objeto para ler entrada do usuário
        
        for (int i = 0; i < numQuestions; i++) {
            int a = random.nextInt(100) + 1; // número aleatório entre 1 e 100
            int b = random.nextInt(100) + 1; // número aleatório entre 1 e 100
            int respostaCorreta = a + b; // resposta correta
            
            System.out.print("Qual é a soma de " + a + " + " + b + "? ");
            int resposta = scanner.nextInt(); // lê a resposta do usuário
            
            if (resposta == respostaCorreta) {
                System.out.println("Parabéns, você acertou!");
                acertos++;
            } else {
                System.out.println("Ops, você errou. A resposta correta é " + respostaCorreta + ".");
            }
        }
        
        System.out.println("Fim da prova. Você acertou " + acertos + " de " + numQuestions + " perguntas.");

        scanner.close();
    }
}
