package listas.lista01;
/*
 Leia um valor de area em acres e apresente-o convertido em metros quadrados m2. A
formula de conversao e: M = A ∗ 4048,58, sendo M a area em metros quadrados e A a
area em acres.
 */
import javax.swing.JOptionPane;
public class Exercicio25 {
    public static void main(String[] args) {
        
        String st1 = JOptionPane.showInputDialog("Digite a area em acres: ");
        double acres = Double.parseDouble(st1);
        double area = acres * 4048.58;

        JOptionPane.showMessageDialog(null, acres + "A correspondem a " + area + "m^2.");
    }
}
