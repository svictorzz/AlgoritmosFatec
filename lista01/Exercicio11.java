package listas.lista01;
/*Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h
(quilometros por hora). A formula de conversao e:  K = M ∗ 3.6, sendo K a velocidade
em km/h e M em m/s.*/
import javax.swing.JOptionPane;
public class Exercicio11 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite a velocidade em m/s: ");
        double velocidade = Double.parseDouble(st1);
        double km = velocidade * 3.6;

        JOptionPane.showMessageDialog(null, velocidade + "m/s correspondem a " + km + "km/h." );
    }
}
