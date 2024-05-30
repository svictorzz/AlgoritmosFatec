package pilhas.pilha_sobre_vetor;

public class PilhaTrabalho {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(50);

        // 25 inserções
        for (int i = 0; i < 25; i++) {
            pilha.empilha(i);
        }

        // 12 exibições de tamanho (não afetam a pilha)
        for (int i = 0; i < 12; i++) {
            System.out.println("Tamanho: " + pilha.tamanho());
        }

        // 10 remoções, 3 delas resultando em "pilha vazia"
        for (int i = 0; i < 10; i++) {
            try {
                pilha.desempilha();
            } catch (RuntimeException e) {
                System.out.println("Pilha vazia na tentativa de remoção " + (i + 1));
            }
        }

        // Exibir a posição do topo ao final
        System.out.println("Posição do topo ao final: " + pilha.getTopo());

    }
}

