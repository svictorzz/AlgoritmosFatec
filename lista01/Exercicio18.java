package listas.lista01;
/*
 Leia um valor de volume em metros cubicos m3 e apresente-o convertido em litros. A
formula de conversao e: L = 1000 ∗ M, sendo L o volume em litros e M o volume em
metros cubicos. 
 */
import javax.swing.JOptionPane;
public class Exercicio18 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite o volume em metros cubicos: ");
        double metros_cubicos = Double.parseDouble(st1);
        double litros = metros_cubicos * 1000;

        JOptionPane.showMessageDialog(null,metros_cubicos + " metros cubicos correspondem a " + litros + "L.");
    }
}
