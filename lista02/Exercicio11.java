package listas.lista02;

import javax.swing.JOptionPane;

/*
 Escreva um programa que leia um numero inteiro maior do que zero e devolva, na tela, a 
soma de todos os seus algarismos. Por exemplo, ao numero 251 corresponder ao valor 
8 (2 + 5 + 1). Se o numero lido nao for maior do que zero, o programa terminara com a
mensagem “Numero invalido”
 */
public class Exercicio11 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro maior que 0:" ));
        
        if (numero <= 0) {
            JOptionPane.showMessageDialog(null, "Numero invalido.");
        } else {
            int soma = 0;
            while (numero > 0) {
                soma += numero % 10;
                numero /= 10;
        }
        JOptionPane.showMessageDialog(null, "A soma dos algarismos do numero digitado e: " + soma);
    }
}
}