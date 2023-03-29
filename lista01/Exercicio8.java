package listas.lista01;
/*
 Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A
formula de conversao e: C = K − 273.15, sendo C a temperatura em Celsius e K a
temperatura em Kelvin.
 */
import javax.swing.JOptionPane;
public class Exercicio8 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite a temperatura em K: ");
        double kelvin = Double.parseDouble(st1);
        double celsius = kelvin - 273.15;
        
        JOptionPane.showMessageDialog(null, kelvin + "°K correspondem a " + celsius + "°C.");
    }
    
}
