package listas.lista01;
/*
 Leia um valor de area em metros quadrados m2 e apresente-o convertido em acres. A
formula de conversao e:  A = M ∗ 0,000247, sendo M a area em metros quadrados e A
a area em acres.
 */
import javax.swing.JOptionPane;
public class Exercicio24 {
    public static void main(String[] args) {

        String st1 = JOptionPane.showInputDialog("Digite a area em m^2: ");
        double area = Double.parseDouble(st1);
        double acres = area * 0.000247;

        JOptionPane.showMessageDialog(null, area + "m^2 correspondem a " + acres + "A.");
    }
}
