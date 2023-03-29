package listas.lista02;

import java.util.Scanner;

/*
 Faca um programa que leia 2 notas de um aluno, verifique se as notas sao validas e 
exiba na tela a media destas notas. Uma nota valida deve ser, obrigatoriamente, um 
valor entre 0.0 e 10.0, onde caso a nota nao possua um valor valido, este fato deve ser 
informado ao usuario e o programa termina.
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        if (nota1 > 10 || nota1 < 0 ) {
            System.out.println("As notas possuem um valor invalido.");
        } else if (nota2 > 10 || nota2 < 0){
            System.out.println("As notas possuem um valor invalido.");
        }
        else {
            System.out.println("Media = " + (nota1 + nota2)/2);
        }

        entrada.close();

    }
}

