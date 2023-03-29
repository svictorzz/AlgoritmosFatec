package listas.lista01;
/*
 Sejam a e b os catetos de um triangulo, onde a hipotenusa e obtida pela 
 equacao: hipotenusa =√a^2 + b^2. Faca um programa que receba os valores de a e b e calcule
o valor da hipotenusa atraves da equacao. Imprima o resultado dessa operacao.
 */
import javax.swing.JOptionPane;
public class Exercicio35 {
    public static void main(String[] args) {
        
        String cateto1 = JOptionPane.showInputDialog("Digite o valor do primeiro cateto: ");
        double a = Double.parseDouble(cateto1);

        String cateto2 = JOptionPane.showInputDialog("Digite o valor do segundo cateto: ");
        double b = Double.parseDouble(cateto2);

        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        hipotenusa = Math.rint (hipotenusa * 100.0) / 100.0;  // multiplica por 100, arredonda e divide por 100 de novo
        System.out.printf("%.2f", hipotenusa);

        JOptionPane.showMessageDialog(null, "A hipotenusa e: " + hipotenusa);
        
    }
}
