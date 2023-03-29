package listas.lista01;
/*
 Leia quatro notas, calcule a media aritmetica e imprima o resultado.
 */
import javax.swing.JOptionPane;
public class Exercicio29 {
    public static void main(String[] args) {

        //pegando o valor das notas 
        String st1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        double nota1 = Double.parseDouble(st1);

        String st2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        double nota2 = Double.parseDouble(st2);

        String st3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
        double nota3 = Double.parseDouble(st3);

        String st4 = JOptionPane.showInputDialog("Digite a quarta nota: ");
        double nota4 = Double.parseDouble(st4);

        //media
        double media = (nota1 + nota2 + nota3 + nota4)/4;

        JOptionPane.showMessageDialog(null, "A media final e: " + media);

    }
}
