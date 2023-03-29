package listas.lista01;
//Leia um numero real e imprima a quinta parte deste numero.
import javax.swing.JOptionPane;
public class Exercicio5 {
    public static void main(String[] args) {
        
        String st1 = JOptionPane.showInputDialog("Digite um numero: ");
        double num1 = Double.parseDouble(st1);

        JOptionPane.showMessageDialog(null, num1 + "/5 = " + (num1/5));
    }
}
