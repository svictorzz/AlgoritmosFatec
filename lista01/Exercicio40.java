package listas.lista01;
/*
 Uma empresa contrata um encanador a R$ 30,00 por dia. Faca um programa que solicite
o numero de dias trabalhados pelo encanador e imprima a quantia lıquida que devera ser 
paga, sabendo-se que sao descontados 8% para imposto de renda. 
 */
import javax.swing.JOptionPane;
public class Exercicio40 {
    public static void main(String[] args) {
        
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de dias trabalhados: "));

        double salario_inicial = (dias * 30);
        double imposto = 0.08 * salario_inicial;
        double salario_final = salario_inicial - imposto;

        JOptionPane.showMessageDialog(null, "A quantia a ser paga é de R$" + salario_final);
        
    }
    
}
