package listas.lista01;
/*
 Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s ˆ
(metros por segundo). A formula de conversao e: M = K/3.6, sendo K a velocidade em
km/h e M em m/s.
 */
import javax.swing.JOptionPane;
public class Exercicio10 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite a velocidade em Km/h: ");
        double kilometros = Double.parseDouble(st1);
        double metros_segundo = kilometros/3.6;

        JOptionPane.showMessageDialog(null, kilometros + "km/h equivalem a " + metros_segundo + "m/s." );
    }
}
