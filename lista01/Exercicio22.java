package listas.lista01;
/*
 Leia um valor de comprimento em jardas e apresente-o convertido em metros. A formula 
de conversao e:  M = 0, 91 ∗ J, sendo J o comprimento em jardas e M o comprimento
em metros.
 */

import javax.swing.JOptionPane;
public class Exercicio22 {
    public static void main(String[] args) {

        String st1 = JOptionPane.showInputDialog("Digite o comprimento em jardas: ");
        double jardas = Double.parseDouble(st1);
        double metros = jardas * 0.91;

        JOptionPane.showMessageDialog(null, jardas + " jardas correspondem a " + metros + "m.");
    }
    
}
