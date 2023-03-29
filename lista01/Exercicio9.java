package listas.lista01;
/*
 Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. A
formula de conversao e: K = C + 273.15, sendo C a temperatura em Celsius e K a
temperatura em Kelvin.
 */
import javax.swing.JOptionPane;
public class Exercicio9 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite a temperatura em C: ");
        double celsius = Double.parseDouble(st1);
        double kelvin = celsius + 273.15;
        
        JOptionPane.showMessageDialog(null, celsius + "°C correspondem a " + kelvin + "°K.");
    }
}
