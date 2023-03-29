package listas.lista01;
/*
 Leia um angulo em radianos e apresente-o convertido em graus. A formula de conversao
e:  G = R ∗ 180/π, sendo G o angulo em graus e  R em radianos e π = 3.14.
 */
import javax.swing.JOptionPane;
public class Exercicio15 {
    public static void main(String[] args) {
        String st1 = JOptionPane.showInputDialog("Digite um angulo em radianos: ");
        double radianos = Double.parseDouble(st1);
        double graus = radianos * 180/3.14;

        JOptionPane.showMessageDialog(null, radianos + " correspondem a "+ graus + "graus.");
    }
    
}
