package listas.lista01;
/*
 Leia um valor de massa em libras e apresente-o convertido em quilogramas. A formula 
de conversao e: K = L∗ 0, 45, sendo K a massa em quilogramas e L a massa em libras.
 */
import javax.swing.JOptionPane;
public class Exercicio21 {
    public static void main(String[] args) {
        
        String st1 = JOptionPane.showInputDialog("Digite a massa em libras: ");
        double libras = Double.parseDouble(st1);
        double kg = libras * 0.45;

        JOptionPane.showMessageDialog(null, libras + " libras correspondem a " + kg + "kg.");
    }
}
