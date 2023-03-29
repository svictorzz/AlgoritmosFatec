package listas.lista01;
//Faça um programa que leia um numero real e o imprima
import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args) {
        
        String st1 = JOptionPane.showInputDialog("Digite um numero real");
        double num1 = Double.parseDouble(st1);

        JOptionPane.showMessageDialog(null,"O numero que voce digitou e: " + num1);
    }
}
