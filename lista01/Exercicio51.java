package listas.lista01;
/*
 Escreva um programa que leia as coordenadas x e y de pontos no R2 e calcule sua
distancia da origem (0, 0).
 */
import java.util.Scanner;
public class Exercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        double x = sc.nextDouble();

        System.out.println("Digite o valor de y: ");
        double y = sc.nextDouble();

        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) ;

        System.out.println("A distancia da origem dos pontos("+ x + "," + y + ") e igual a: " + d);

        sc.close();
        
    }
}
