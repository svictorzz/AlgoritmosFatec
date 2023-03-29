package listas.lista01;
/*  Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
A formula de conversao e:  F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit
e C a temperatura em Celsius.*/
import javax.swing.JOptionPane;
public class Exercicio6 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite a temperatura em °C: ");
        double celsius = Double.parseDouble(st1);
        double fahrenheit = (celsius * 9/5) + 32;

        JOptionPane.showMessageDialog(null, celsius + "°C correspondem a " + fahrenheit + "°F");

    }
}
