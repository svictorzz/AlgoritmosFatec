package listas.lista01;
/*
 Leia um angulo em graus e apresente-o convertido em radianos. A formula de conversao
e: R = G ∗ π/180, sendo G o angulo em graus e ˆ R em radianos e π = 3.14.
 */
import javax.swing.JOptionPane;
public class Exercicio14 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite um angulo em graus: ");
        double graus = Double.parseDouble(st1);
        double radianos = graus * 3.14/180;

        JOptionPane.showMessageDialog(null, graus + " ° correspondem a "+ radianos + "radianos.");
    }
}
