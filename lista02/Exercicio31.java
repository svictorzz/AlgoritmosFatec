package listas.lista02;
/*
 Faca um programa que receba a altura e o peso de uma pessoa. De acordo com a tabela
a seguir, verifique e mostra qual a classificacao dessa pessoa. 
Altura              Peso
                    Ate 60   Entre 60 e 90 (Inclusive)   Acima de 90
Menor que 1,20      A                   D                     G
De 1,20 a 1,70      B                   E                     H
Maior que 1,70      C                   F                     I
 */
import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a altura: ");
        double altura = input.nextDouble();
        
        System.out.println("Digite o peso: ");
        double peso = input.nextDouble();
        
        if (altura < 1.20) {
            if (peso < 60) {
                System.out.println("Altura: " + altura + "m\n" + "Peso: " + peso + "kg\n" +
                "Sua classificação é A ");
            } else if(peso >= 60 && peso <= 90) {
                System.out.println("Altura: " + altura + "m\n" + "Peso: " + peso + "kg\n" +
                "Sua classificação é D ");
            } else if(peso > 90) {
                System.out.println("Altura: " + altura + "m\n" + "Peso: " + peso + "kg\n" +
                "Sua classificação é G ");
            } 
        } else if (altura >= 1.20 && altura <= 1.70){
            if (peso < 60) {
                System.out.println("Altura: " + altura + "m\n" + "Peso: " + peso + "kg\n" +
                "Sua classificação é B ");
            } else if(peso >= 60 && peso <= 90) {
                System.out.println("Altura: " + altura + "m\n" + "Peso: " + peso + "kg\n" +
                "Sua classificação é E ");
            } else if(peso > 90) {
                System.out.println("Altura: " + altura + "m\n" + "Peso: " + peso + "kg\n" +
                "Sua classificação é H ");
            } 
        } else if (altura > 1.70){
            if (peso < 60) {
                System.out.println("Altura: " + altura + "m\n" + "Peso: " + peso + "kg\n" +
                "Sua classificação é C ");
            } else if(peso >= 60 && peso <= 90) {
                System.out.println("Altura: " + altura + "m\n" + "Peso: " + peso + "kg\n" +
                "Sua classificação é F ");
            } else if(peso > 90) {
                System.out.println("Altura: " + altura + "m\n" + "Peso: " + peso + "kg\n" +
                "Sua classificação é I ");
            } 
        } 
        input.close();
    }
    
}
