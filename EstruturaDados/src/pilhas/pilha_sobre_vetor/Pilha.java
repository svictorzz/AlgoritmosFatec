package pilhas.pilha_sobre_vetor;

public class Pilha {
    private int[] dados;
    private int topo;

    public static final int CAPACIDADE_MINIMA = 10;

    public Pilha(int capacidade){
        dados = new int[capacidade];
        topo = -1;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public Pilha(){
        this(CAPACIDADE_MINIMA);
    }
    public boolean estaVazia(){
        return topo == -1;
    }
    public boolean estaCheia(){
        return topo == dados.length - 1;
    }
    public boolean empilha(int i){
        if (estaCheia()) return false;
        dados[++topo] = i;
        return true;
    }
    public int desempilha(){
        if (estaVazia()) return -1;
        int temp = dados[topo--];
        return temp;
    }
    int tamanho(){
        return topo + 1;
    }

    //12. desempilhar menor
    public static void esvaziarMenor(Pilha p1, Pilha p2) {
        if (p1.tamanho() <= p2.tamanho()) {
            moverElementos(p1, p2);
        } else {
            moverElementos(p2, p1);
        }
    }

    private static void moverElementos(Pilha inicio, Pilha destino) {
        while (!inicio.estaVazia()) {
            destino.empilha(inicio.desempilha());
        }
    }

    @Override
    public String toString(){
        if (estaVazia()) return "pilha vazia";
        String s = "";
        for (int i = topo; i >= 0; i--) {
            s = s + dados[i] + "\n";
        }
        s += "-------------";
        return s;
    }
}
