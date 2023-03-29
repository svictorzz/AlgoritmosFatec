package listas.lista01;
/*
 Leia um valor inteiro em segundos, e imprima-o em horas, minutos e segundos.
 */
import java.util.Scanner;
public class Exercicio48 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos: ");
        int tempoSegundos = scanner.nextInt();

        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600)/60;
        int segundos = tempoSegundos % 60;
        
        System.out.println("O tempo e: " + horas + "h" + minutos + "m" + segundos + "s.");

        scanner.close();
    }
}
