package listas.lista01;
/*
 Faça a leitura de tres valores e apresente como resultado a soma dos quadrados dos
tres valores lidos.
 */
import javax.swing.JOptionPane;
public class Exercicio28 {
    public static void main(String[] args) {
        
    double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
    double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero: "));

    double soma_quadrado = (num1 * num1) + (num2 * num2) + (num3 * num3);

    JOptionPane.showMessageDialog(null, "A soma dos quadrados de " + num1 + ", " + num2 + " e " + num3 +
     " é: " + soma_quadrado);

    }
    

}
