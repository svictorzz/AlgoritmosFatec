package listas.lista01;
/*
 Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
A formula de conversao e:  C = 5.0 ∗ (F − 32.0)/9.0, sendo C a temperatura em Celsius
e F a temperatura em Fahrenheit.

 */
import javax.swing.JOptionPane;
public class Exercicio7 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite a temperatura em °F: ");
        double fahrenheit = Double.parseDouble(st1);
        double celsius = 5 * (fahrenheit - 32)/9;
        

        JOptionPane.showMessageDialog(null, fahrenheit + "°F correspondem a " + celsius + "°C");
       
    }
}
