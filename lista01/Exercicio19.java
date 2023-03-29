package listas.lista01;
/*
 Leia um valor de volume em litros e apresente-o convertido em metros cubicos m3. A
formula de conversao e:  M = L/1000 , sendo L o volume em litros e M o volume em metros
cubicos.
 */
import javax.swing.JOptionPane;
public class Exercicio19 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite o volume em litros: ");
        double litros = Double.parseDouble(st1);
        double metros_cubicos = litros/1000;

        JOptionPane.showMessageDialog(null,litros + "L correspondem a " + metros_cubicos + " metros cubicos." );
    }
}
