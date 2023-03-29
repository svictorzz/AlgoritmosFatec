package listas.lista01;
/*
 Leia um valor de comprimento em centımetros e apresente-o convertido em polegadas.
A formula de conversao e:  P = C/2,54 sendo C o comprimento em centımetros e P o
comprimento em polegadas.
 */
import javax.swing.JOptionPane;

public class Exercicio17 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite o comprimento em cm: ");
        double centimetros = Double.parseDouble(st1);
        double polegadas = centimetros/2.54;

        JOptionPane.showMessageDialog(null, centimetros + "cm correspondem a " + polegadas + " polegadas." );
    }
}
