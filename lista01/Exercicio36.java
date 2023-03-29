package listas.lista01;
/*
 Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro. O volume
de um cilindro circular e calculado por meio da seguinte formula: V = π ∗ raio2 ∗ altura,
onde π = 3.141592.
 */
import javax.swing.JOptionPane;
public class Exercicio36 {
    public static void main(String[] args) {

        String altura_st = JOptionPane.showInputDialog("Digite a altura do cilindro: ");
        double altura = Double.parseDouble(altura_st);

        String raio_st = JOptionPane.showInputDialog("Digite o raio do cilindro: ");
        double raio = Double.parseDouble(raio_st);

        double volume = Math.pow(raio, 2) * altura * 3.141592;
        volume = Math.rint(volume * 100.0)/100.0;
        System.out.printf("%.2f", volume);

        JOptionPane.showMessageDialog(null, "O volume do cilindro e igual a: " + volume);
    }
}
