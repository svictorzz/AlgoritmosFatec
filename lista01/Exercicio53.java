package listas.lista01;
/*
 Faca um programa para ler as dimensoes de um terreno (comprimento c e largura l),
bem como o preco do metro de tela p. Imprima o custo para cercar este mesmo terreno
com tela
 */
import javax.swing.JOptionPane;
public class Exercicio53 {
    public static void main(String[] args) {
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do terreno em metros: "));
        double l = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno em metros: "));

        double precoMetro = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do metra de tela em R$: "));
        double areaTerreno = c * l;
        double p = areaTerreno * precoMetro;
        p = Math.rint (p * 100.0) / 100.0;

        JOptionPane.showMessageDialog(null, "O custo para cercar o terreno inteiro com tela e: R$" + p);

    }
}
