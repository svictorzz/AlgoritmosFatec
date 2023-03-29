package listas.lista02;
import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida em Km: ");
        double distancia = input.nextDouble();

        System.out.println("Digite a quantidade de litros de gasolina consumidos: ");
        double litros = input.nextDouble();

        double consumo = distancia / litros;

        if (consumo < 8) {
            System.out.println("Consumo: " + consumo + " Km/l. Venda o carro!");
        } else if (consumo >= 8 && consumo <= 14){
            System.out.println("Consumo: " + consumo + " Km/l. Econômico!");
        } else {
            System.out.println("Consumo: " + consumo + " Km/l. Super Econômico!");
        }

        input.close();
    }
}
