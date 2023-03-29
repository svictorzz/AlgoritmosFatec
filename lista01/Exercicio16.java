package listas.lista01;
/*
 Leia um valor de comprimento em polegadas e apresente-o convertido em centımetros.
A formula de conversao e: C = P ∗ 2, 54, sendo C o comprimento em centımetros e P o
comprimento em polegadas.
 */
import javax.swing.JOptionPane;
public class Exercicio16 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite o comprimento em polegadas: ");
        double polegadas = Double.parseDouble(st1);
        double centimetros = polegadas * 2.54;

        JOptionPane.showMessageDialog(null,polegadas  + " polegadas correspondem a " + centimetros + "cm");

    }
}
