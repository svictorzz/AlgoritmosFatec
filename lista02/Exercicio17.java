package listas.lista02;
/*
Faca um programa que calcule e mostre a area de um trapezio. Sabe-se que: 
A = ((basemaior + basemenor) ∗ altura) / 2
Lembre-se a base maior e a base menor devem ser numeros maiores que zero.
 */
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da base maior: ");
        double baseMaior = input.nextInt();
        
        System.out.println("Digite o valor da base menor: ");
        double baseMenor = input.nextInt();

        System.out.println("Digite a altura: ");
        double altura = input.nextInt();

        if (baseMaior <= 0 || baseMenor <= 0) {
            System.out.println("O valor das bases deve ser maior que 0.");
        } else {
            double area = ((baseMaior + baseMenor) * altura) / 2;
            System.out.println("O valor da área é: " + area + "m^2.");
        }

        input.close();
    }
}
