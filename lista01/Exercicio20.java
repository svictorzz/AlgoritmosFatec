package listas.lista01;
/*
 Leia um valor de massa em quilogramas e apresente-o convertido em libras. A formula
de conversao e: L = K/0,45, sendo K a massa em quilogramas e L a massa em libras.
 */
import javax.swing.JOptionPane;
public class Exercicio20 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite a massa em Kg: ");
        double kg = Double.parseDouble(st1);
        double libras = kg/0.45;

        JOptionPane.showMessageDialog(null,kg + "kg correspondem a " + libras + " libras.");
    }
}
