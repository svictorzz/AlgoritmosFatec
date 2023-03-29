package listas.lista02;

import java.util.Scanner;

/*
Dados tres valores, A, B, C, verificar se eles podem ser valores dos lados de um triangulo
e, se forem, se é um triangulo escaleno, equilatero ou isosceles, considerando os seguin-
tes conceitos:
• O comprimento de cada lado de um triangulo e menor do que a soma dos outros 
dois lados.
• Chama-se equilatero o triangulo que tem tres lados iguais. 
• Denominam-se isosceles o triangulo que tem o comprimento de dois lados iguais. 
• Recebe o nome de escaleno o triangulo que tem os tres lados diferentes.
 */
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = input.nextDouble();

        System.out.println("Digite o valor de B: ");
        double B = input.nextDouble();

        System.out.println("Digite o valor de C: ");
        double C = input.nextDouble();

        if (A <= 0 || B <= 0 || C <= 0) {
            System.out.println("Os valores devem ser maiores que 0.");
        } else if (A == B && B == C){
            System.out.println("Triângulo equilátero.");
        } else if (A == B || A == C || B == C){
            System.out.println("Triângulo isósceles.");
        } else {
            System.out.println("Triângulo escaleno.");
        }

        input.close();
    }
}
