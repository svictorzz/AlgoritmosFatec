package listas.lista02;
/*
 Calcule as raızes da equacao de 2o grau
 A variavel a tem que ser diferente de zero. Caso seja igual, imprima a mensagem “Nao
e equacao de segundo grau”. 
• Se ∆ < 0, nao existe real. Imprima a mensagem  Nao existe raiz.
• Se ∆ = 0, existe uma raiz real. Imprima a raiz e a mensagem Raiz unica.
• Se ∆ ≥ 0, imprima as duas raızes reais.
 */
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do coeficiente a: ");
        double a = input.nextDouble();

        System.out.println("Digite o valor do coeficiente b: ");
        double b = input.nextDouble();

        System.out.println("Digite o valor do coeficiente c: ");
        double c = input.nextDouble();

        double delta = (b * b) - 4 * a * c;
        
        if (a != 0) {
            if (delta < 0) {
                System.out.println("Não existe raíz.");
            } else if (delta == 0){
                double x = (-b + Math.sqrt(delta))/ 2 * a;

                System.out.println("Raiz unica: " + x);
            }
            else {
                double x1 = (-b + Math.sqrt(delta))/ (2 * a);
                double x2 = (-b - Math.sqrt(delta))/ (2 * a);

                System.out.println("x1 = " + x1 + "\nx2 = " + x2);

            }
        } else {
            System.out.println("Não é equação de segundo grau.");
        }
        


        input.close();
    }

    
}
