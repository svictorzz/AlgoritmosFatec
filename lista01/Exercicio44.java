package listas.lista01;
/*
 Receba a altura do degrau de uma escada e a altura que o usuario deseja alcancar 
subindo a escada. Calcule e mostre quantos degraus o usuario devera subir para atingir
seu objetivo.
 */
import java.util.Scanner;
public class Exercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do degrau em cm: ");
        double alturaDegrau = Double.parseDouble(sc.nextLine());

        
        System.out.println("Digite a altura final desejada em m: ");
        double alturaDesejada = Double.parseDouble(sc.nextLine());
        
        int degraus = Double.valueOf(alturaDesejada / alturaDegrau).intValue();
        System.out.println("Para chegar ate " + alturaDesejada + "m de altura, sera necessario subir " + degraus + " degraus." );

        sc.close();
        
    }
}
