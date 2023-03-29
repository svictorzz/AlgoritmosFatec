package listas.lista01;
/*
 Leia uma distancia em quilometros e apresente-a convertida em milhas. A formula de 
conversao é:  M = K/1,61 , sendo K a distancia em quilometros e M em milhas.
 */
import javax.swing.JOptionPane;
public class Exercicio13 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite a distancia em km: ");
        double km = Double.parseDouble(st1);
        double milhas = km / 1.61;
    
    JOptionPane.showMessageDialog(null, km + " km correspondem a " + milhas + " milhas." );
    }
}
