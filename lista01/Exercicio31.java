package listas.lista01;
/*
 Leia um numero inteiro e imprima o seu antecessor e o seu sucessor
 */
import javax.swing.JOptionPane;
public class Exercicio31 {
    public static void main(String[] args) {

        String st1 = JOptionPane.showInputDialog("Digite um numero inteiro: ");
        int numero = Integer.parseInt(st1);

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        JOptionPane.showMessageDialog(null, "O antecessor de " + numero + " e: " + antecessor +
         " e seu sucessor e: " + sucessor);
    }
}
