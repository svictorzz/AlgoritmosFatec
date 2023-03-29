package listas.lista01;
/*
Leia um valor de comprimento em metros e apresente-o convertido em jardas. A formula 
de conversao e:  J = M/0,91 , sendo J o comprimento em jardas e M o comprimento em
metros.
 */
import javax.swing.JOptionPane;
public class Exercicio23 {
    public static void main(String[] args) {

        String st1 = JOptionPane.showInputDialog("Digite o comprimento em metros: ");
        double metros = Double.parseDouble(st1);
        double jardas = metros/0.91;

        JOptionPane.showMessageDialog(null, metros + "m correspondem a " + jardas + " jardas.");
    }
        
 }
 