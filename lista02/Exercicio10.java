package listas.lista02;

import java.util.Scanner;

/*
 Faca um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu
peso ideal, utilizando as seguintes formulas (onde h corresponde a altura): 
• Homens: (72.7 ∗ h) − 58
• Mulheres: (62, 1 ∗ h) − 44, 7
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite o sexo ([M]asculino ou [F]eminino): ");
        char sexo = entrada.next().charAt(0);
        sexo = Character.toUpperCase(sexo);

        switch (sexo) {
            case 'M':
                double pesoIdealM = (72.7 * altura) - 58;
                System.out.println("O peso ideal para um homem de " + altura + "m e: " + pesoIdealM + "kg.");
                break;
            case 'F':
                double pesoIdealF = (62.1 * altura) - 44.7;
                System.out.println("O peso ideal para uma mulher de " + altura + "m e: " + pesoIdealF + "kg.");
                break;
            default:
                System.out.println("Escolha uma opcao valida.");
                break;
        }
        entrada.close();
    }
}
