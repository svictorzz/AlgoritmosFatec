package listas.lista01;
/*
 Leia um valor de area em metros quadrados m2 e apresente-o convertido em hectares.
A formula de conversao e: H = M ∗ 0,0001, sendo M a area em metros quadrados e H
a area em hectares.
 */
import javax.swing.JOptionPane;
public class Exercicio26 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite a area em m^2: ");
        double metros_quadrados = Double.parseDouble(st1);
        double hectares = metros_quadrados * 0.0001;

        JOptionPane.showMessageDialog(null, metros_quadrados + " m^2 correspondem a " + hectares + " hectares");
    }
}
