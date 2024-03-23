package pilhas.pilha_sobre_lista;

public class Pilha {
    private Node topo;
    public boolean estaVazia(){
        return topo == null;
    }

    public void empilha(int info){
        Node novo = new Node(info);
        if (!estaVazia()){
            novo.setProximo(novo);
        }
        topo = novo;
    }

    public int desempilha(){
        int temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }

    public int consultaTopo(){
        return topo.getInfo();
    }

    @Override
    public String toString(){
        String s = "";
        if (estaVazia()) s += "pilha vazia.";
        else {
            Node aux = topo;
            while (aux != null){
                s += aux + "\n";
                aux = aux.getProximo();
            }
        }
        return s;
    }
}

class Node {
    private int info;
    private Node proximo;

    public Node (int info){
        setInfo(info);
        setProximo(null);
    }

    public int getInfo(){
        return info;
    }

    public void setInfo(int info){
        this.info = info;
    }

    public Node getProximo(){
        return proximo;
    }

    public void setProximo(Node proximo){
        this.proximo = proximo;
    }

    @Override
    public String toString(){
        return "|" + info + "|";
    }
}
