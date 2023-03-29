package listas.lista01;
/*
 Faca um programa que leia um numero inteiro positivo de tres dıgitos (de 100 a 999).
Gere outro numero formado pelos dıgitos invertidos do numero lido. Exemplo: 
numeroLido = 123
numeroGerado = 321
 */
import javax.swing.JOptionPane;
public class Exercicio46 {
    public static void main(String[] args) {
        int numeroLido = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro de 100 a 999: "));

        int primeiroDigito = numeroLido % 10;
        int numero2 = numeroLido/10;
        
        int segundoDigito = numero2 % 10;
        int numero3 = numero2/10;

        int terceiroDigito = numero3 % 10;
        String numeroGerado = String.valueOf(primeiroDigito) + String.valueOf(segundoDigito) + String.valueOf(terceiroDigito);

        JOptionPane.showMessageDialog(null, "O numero " + numeroLido + " invertido fica: " + numeroGerado);
        
    }
}
