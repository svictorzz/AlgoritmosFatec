package listas.lista01;
//Faça um programa que leia um numero inteiro e o imprima
import javax.swing.JOptionPane;
public class Exercicio1{
    public static void main(String[] args) {

        String st1 = JOptionPane.showInputDialog("Digite um numero inteiro: ");
        int num1 = Integer.parseInt(st1);
        JOptionPane.showMessageDialog(null,"O numero que voce digitou e: " + num1);
    }
}