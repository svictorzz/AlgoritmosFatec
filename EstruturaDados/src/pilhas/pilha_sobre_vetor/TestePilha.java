package pilhas.pilha_sobre_vetor;

import javax.swing.JOptionPane;
import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {
        Random random = new Random();
        Pilha pilha = new Pilha();
        do {
            if (random.nextBoolean()) {
                if (!pilha.estaCheia()){
                    pilha.empilha(random.nextInt(10));
                }
            } else{
                if (!pilha.estaVazia()){
                    JOptionPane.showMessageDialog(null, pilha.desempilha(), "Elemento desempilhado", 1);
                }
            }
            JOptionPane.showMessageDialog(null, pilha, "Minha pilha", 1);
        } while (!pilha.estaVazia());
    }
}