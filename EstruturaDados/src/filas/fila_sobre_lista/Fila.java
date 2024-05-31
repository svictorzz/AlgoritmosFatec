package filas.fila_sobre_lista;

import filas.Pessoa;

public class Fila {
    private No primeiro;
    private No ultimo;

    public Fila() {
        primeiro = null;
        ultimo = null;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void enfileira(Pessoa p1) {
        No novo = new No(p1);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    public Pessoa desenfileira() {
        if (estaVazia()) {
            return null;
        }
        Pessoa temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (estaVazia()) {
            ultimo = null;
        }
        return temp;
    }

    @Override
    public String toString() {
        if (estaVazia()) {
            return "fila vazia";
        } else {
            StringBuilder s = new StringBuilder();
            No aux = primeiro;
            while (aux != null) {
                s.append(aux);
                aux = aux.getProximo();
            }
            return s.toString();
        }
    }


    //17. Intercalar 2 filas
    public static Fila intercalarFilas(Fila f1, Fila f2) {
        Fila intercalada = new Fila();

        while (!f1.estaVazia() || !f2.estaVazia()) {
            if (!f1.estaVazia()) {
                intercalada.enfileira(f1.desenfileira());
            }
            if (!f2.estaVazia()) {
                intercalada.enfileira(f2.desenfileira());
            }
        }
        return intercalada;
    }


    //19. Dado um valor, verificar sua posição na fila
    public int posicaoDeElemento(Pessoa valor) {
        No aux = primeiro;
        int posicao = 0;
        while (aux != null) {
            if (aux.getInfo().equals(valor)) {
                return posicao;
            }
            aux = aux.getProximo();
            posicao++;
        }
        return -1; // Elemento não encontrado
    }
}

class No {
    private Pessoa info;
    private No proximo;

    public No(Pessoa info) {
        setInfo(info);
        setProximo(null);
    }

    public Pessoa getInfo() {
        return info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setInfo(Pessoa info) {
        this.info = info;
    }


    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "|" + info + "|->";
    }
}
