package listas.lista02;

//Faça um programa que receba dois numeros e mostre qual deles é o maior.
import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero: "));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " é maior que " + num2);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, num2 + " é maior que " + num1);
        }
        else{
            JOptionPane.showMessageDialog(null, num1 + " = " + num2);
        }


    }
    
}