package listas.lista01;
import javax.swing.JOptionPane;

/*
 A importancia de R$ 780.000,00 sera dividida entre tres ganhadores de um concurso. 
Sendo que da quantia total:
• O primeiro ganhador recebera 46%; 
• O segundo recebera 32%; 
• O terceiro recebera o restante; 
Calcule e imprima a quantia ganha por cada um dos ganhadores.
 */
public class Exercicio39 {
    public static void main(String[] args) {
         
        double valorTotal = 780000.00;
        double primeiroGanhador = valorTotal * 0.46;
        double segundoGanhador = valorTotal * 0.32;
        double terceiroGanhador = valorTotal - primeiroGanhador - segundoGanhador;

        JOptionPane.showMessageDialog(null, "O primeiro ganhador recebera: R$" + primeiroGanhador);
        JOptionPane.showMessageDialog(null, "O segundo ganhador recebera: R$" + segundoGanhador);
        JOptionPane.showMessageDialog(null, "O terceiro ganhador recebera: R$" + terceiroGanhador);
    }
}
