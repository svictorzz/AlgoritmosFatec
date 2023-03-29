package listas.lista01;
// Peça ao usuario para digitar tres valores inteiros e imprima a soma deles.
import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main(String[] args) {
        
        String st1 = JOptionPane.showInputDialog("Digite o primeiro numero inteiro: ");
        String st2 = JOptionPane.showInputDialog("Digite o segundo numero inteiro: ");
        String st3 = JOptionPane.showInputDialog("Digite o terceiro numero inteiro: ");

        int num1 = Integer.parseInt(st1);
        int num2 = Integer.parseInt(st2);
        int num3 = Integer.parseInt(st3);

        int soma = num1 + num2 + num3;

        JOptionPane.showMessageDialog(null,num1 + "+" + num2 + "+" + num3 + "=" + soma);
    }
}
