package listas.lista01;
//Leia um numero real e imprima o resultado do quadrado desse numero.
import javax.swing.JOptionPane;
public class Exercicio4 {
    public static void main(String[] args) {

        String st1 = JOptionPane.showInputDialog("Digite um numero: ");
        double num1 = Double.parseDouble(st1);

        double quadrado = Math.pow(num1, 2);
        quadrado = Math.rint (quadrado * 100.0) / 100.0;  // multiplica por 100, arredonda e divide por 100 de novo
        System.out.printf ("%.2f", quadrado);

        JOptionPane.showMessageDialog(null,"O quadrado de " + num1 + " e: " + quadrado);
    }
    
}
