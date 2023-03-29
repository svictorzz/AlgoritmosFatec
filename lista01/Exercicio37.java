package listas.lista01;
/*
 Faca um programa que leia o valor de um produto e imprima o valor com desconto, tendo
em vista que o desconto foi de 12%
 */
import javax.swing.JOptionPane;

public class Exercicio37 {
    public static void main(String[] args) {

        String valor_st = JOptionPane.showInputDialog("Digite o valor do produto: ");
        double valor_original = Double.parseDouble(valor_st);

        double percentual = 12.0 / 100.0;
        double valor_final = valor_original - (percentual * valor_original);

        JOptionPane.showMessageDialog(null, "O valor final com desconto e igual a R$:" + valor_final );
        
    }
}
