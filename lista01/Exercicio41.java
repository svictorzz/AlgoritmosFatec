package listas.lista01;
/*
 Faca um programa que leia o valor da hora de trabalho (em reais) e numero de horas 
trabalhadas no mes. Imprima o valor a ser pago ao funcionario, adicionando 10% sobre 
o valor calculado.
 */
import javax.swing.JOptionPane;
public class Exercicio41 {
    public static void main(String[] args) {

        String valor_hora_st = JOptionPane.showInputDialog("Digite o valor da hora de trabalho em R$: ");
        double valor_hora = Double.parseDouble(valor_hora_st);

        String horas_trabalhadas_st = JOptionPane.showInputDialog("Digite o numero de horas trabalhadas no mes: ");
        double horas_trabalhadas = Double.parseDouble(horas_trabalhadas_st);
        
        double salario = (valor_hora * horas_trabalhadas) + (0.1 * valor_hora * horas_trabalhadas);

        JOptionPane.showMessageDialog(null, "O valor a ser pago ao funcionario e de: R$" + salario);
    }
    
}
