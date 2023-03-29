package listas.lista01;
/*
 Leia o tamanho do lado de um quadrado e imprima como resultado a sua area.
 */
import javax.swing.JOptionPane;
public class Exercicio33 {
    public static void main(String[] args) {
        
        String st1 = JOptionPane.showInputDialog("Digite o valor do lado do quadrado: ");
        double lado = Double.parseDouble(st1);

        double area = Math.pow(lado, 2);

        JOptionPane.showMessageDialog(null, "A area do quadrado e: " + area);
    }
}
