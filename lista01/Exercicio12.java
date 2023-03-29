package listas.lista01;
/*
 Leia uma distancia em milhas e apresente-a convertida em quilometros. A formula de 
conversao e:  K = 1,61 ∗ M, sendo K a distancia em quil ˆ ometros e ˆ M em milhas.
 */
import javax.swing.JOptionPane;
public class Exercicio12 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite a distancia em milhas: ");
        double milhas = Double.parseDouble(st1);
        double km = milhas * 1.61;
    
    JOptionPane.showMessageDialog(null, milhas + " milhas correspondem a " + km + " km." );
    }
 }

