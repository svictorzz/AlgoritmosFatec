package listas.lista01;
/*
 Implemente um programa que calcule o ano de nascimento de uma pessoa a partir de
sua idade e do ano atual.

 */
import javax.swing.JOptionPane;
public class Exercicio50 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

        int anoNascimento = anoAtual - idade;

        JOptionPane.showMessageDialog(null, "Voce nasceu em: " + anoNascimento);
    }
}
