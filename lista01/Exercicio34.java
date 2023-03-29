package listas.lista01;
/*
 Leia o valor do raio de um cırculo e calcule e imprima a area do cırculo correspondente.
A area do cırculo e π ∗ raio2, considere π = 3.141592.
 */
import javax.swing.JOptionPane;
public class Exercicio34 {
    public static void main(String[] args) {
        
        String st1 = JOptionPane.showInputDialog("Digite o valor do raio do circulo: ");
        double raio = Double.parseDouble(st1);

        double area = (Math.pow(raio, 2) * 3.141592);
        area = Math.rint (area * 100.0) / 100.0;  // multiplica por 100, arredonda e divide por 100 de novo
        System.out.printf ("%.2f", area);

        JOptionPane.showMessageDialog(null, "A area do circulo e: " + area);
    }
}
