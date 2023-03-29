package listas.lista01;
/*
 Leia o salario de um funcionario. Calcule e imprima o valor do novo salario, sabendo que 
ele recebeu um aumento de 25%.
 */
import javax.swing.JOptionPane;
public class Exercicio38 {
    public static void main(String[] args) {

        String salario_st = JOptionPane.showInputDialog("Digite o salario do funcionario em R$: ");
        double salario_original = Double.parseDouble(salario_st);

        double percentual = 25.0/100.0;
        double salario_final = salario_original + (salario_original * percentual);

        JOptionPane.showMessageDialog(null, "O novo salario e R$" + salario_final);
    
    }
    
}
