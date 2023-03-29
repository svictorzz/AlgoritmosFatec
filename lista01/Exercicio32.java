package listas.lista01;
/*
 Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de
seu dobro.
 */
import javax.swing.JOptionPane;
public class Exercicio32 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));

        int triplo = numero * 3;
        int dobro = numero * 2;

        int sucessor_triplo = triplo + 1; 
        int antecessor_dobro = dobro - 1; 
        int soma = sucessor_triplo + antecessor_dobro;

        JOptionPane.showMessageDialog(null, "A soma do sucessor do triplo de " + numero +
         " com o antecessor de seu dobro e igual a: " + soma);
    }
}
