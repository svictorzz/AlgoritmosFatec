package pilhas.pilha_sobre_lista;

import javax.swing.JOptionPane;
import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {
        Random random = new Random();
        Pilha pilha = new Pilha();
        do {
            if (random.nextBoolean())
                pilha.empilha(random.nextInt(10));
            else
                JOptionPane.showMessageDialog(null, pilha.desempilha());
            JOptionPane.showMessageDialog(null, pilha);
        } while (!pilha.estaVazia());
    }
}
