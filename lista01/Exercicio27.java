package listas.lista01;
/*
 Leia um valor de area em hectares e apresente-o convertido em metros quadrados m2.
A formula de conversao e: M = H ∗ 10000, sendo M a area em metros quadrados e  H
a area em hectares.
 */
import javax.swing.JOptionPane;
public class Exercicio27 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite o valor da area em hectares: ");
        double hectares = Double.parseDouble(st1);
        double metros_quadrados = hectares * 10000;

        JOptionPane.showMessageDialog(null, hectares + " hectares correspondem a " + metros_quadrados + " m^2." );
    }
}
