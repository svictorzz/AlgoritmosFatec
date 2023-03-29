package listas.lista01;
/*
 Leia um valor em real e a cotacao do dolar. Em seguida, imprima o valor correspondente 
em dolares.
 */
import javax.swing.JOptionPane;
public class Exercicio30 {

    public static void main(String[] args) {
        
        String st1 = JOptionPane.showInputDialog("Digite o valor em R$: ");
        double real = Double.parseDouble(st1);

        String st2 = JOptionPane.showInputDialog("Digite a cotacao atual do dolar: ");
        double cotacao = Double.parseDouble(st2);

        double dolar = real / cotacao;
        
        dolar = Math.rint (dolar * 100.0) / 100.0;  // multiplica por 100, arredonda e divide por 100 de novo
        System.out.printf ("%.2f", dolar);

        JOptionPane.showMessageDialog(null, "R$" + real + " equivalem a " + "$" + dolar);
    }
           
}
