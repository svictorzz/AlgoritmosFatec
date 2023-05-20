package listas.lista04;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] v = new int[tamanho];

        System.out.println("Agora digite " + tamanho + " numeros: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Posição " + i + ":");
            v[i] = scanner.nextInt();
        }

        System.out.println("Vou mostrar os números em ordem inversa: ");

        for (int i = v.length - 1; i >= 0; i--) {
            System.out.println(v[i] + " ");
        }

        scanner.close();
    }
}
