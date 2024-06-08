package arvore;

public class ArvoreBinaria {
    private No raiz;

    public boolean estaVazia(){
        return raiz == null;
    }

    public void insere(int x){
        No novo = new No(x);
        if (estaVazia()){
            raiz = novo;
        } else {
            insereRec(novo, raiz);
        }
    }

    void insereRec(No novo, No atual){
        if (novo.getInfo() <= atual.getInfo()){
            if (atual.getEsquerdo() == null){
                atual.setEsquerdo(novo);
            } else {
                insereRec(novo, atual.getEsquerdo());
            }
        } else {
            if (atual.getDireito() == null){
                atual.setDireito(novo);
            } else {
                insereRec(novo, atual.getDireito());
            }
        }
    }

    public String toStringEmOrdem (){
        if (estaVazia())
            return "Arvore vazia.";
        return toStringEmOrdemRec(raiz);
    }

    String toStringEmOrdemRec (No atual) {
        if (atual == null)
            return "";
        return toStringEmOrdemRec(atual.getEsquerdo()) + atual + " " + toStringEmOrdemRec(atual.getDireito());
    }

    //achar o menor no
    public int menor(){
        if (estaVazia()) return -1;
        No aux = raiz;
        while (aux.getEsquerdo() != null){
            aux = aux.getEsquerdo();
        }
        return aux.getInfo();
    }

    //achar o maior no
    public int maior(){
        if (estaVazia()) return -1;
        No aux = raiz;
        while (aux.getDireito() != null){
            aux = aux.getDireito();
        }
        return aux.getInfo();
    }

    //contar o numero de nos
    public int numNos(){
        if(estaVazia()) return 0;
        return numNosRec(raiz);
    }

    int numNosRec(No atual){
        if(atual == null) return 0;
        return numNosRec(atual.getEsquerdo()) + 1 + numNosRec(atual.getDireito());
    }

    // buscar um no
    public boolean busca(int x){
        return buscaRec(x, raiz);
    }

    boolean buscaRec(int x, No atual){
        if (atual == null) return false;
        if (x == atual.getInfo()) return true;
        if (x < atual.getInfo()) return buscaRec(x, atual.getEsquerdo());
        return buscaRec(x, atual.getDireito());
    }

    // calcular a altura da arvore
    public int altura(){
        return alturaRec(raiz);
    }

    int alturaRec(No atual){
        if (atual == null) return -1;
        int alturaEsq = alturaRec(atual.getEsquerdo());
        int alturaDir = alturaRec(atual.getDireito());
        return Math.max(alturaEsq, alturaDir) + 1;
    }

    // verificar se a arvore e balanceada
    public boolean ehBalanceada(){
        return ehBalanceadaRec(raiz) != -1;
    }

    int ehBalanceadaRec(No atual){
        if (atual == null) return 0;
        int alturaEsq = ehBalanceadaRec(atual.getEsquerdo());
        if (alturaEsq == -1) return -1;
        int alturaDir = ehBalanceadaRec(atual.getDireito());
        if (alturaEsq == -1) return -1;
        if (Math.abs(alturaEsq - alturaDir) > 1) return -1;
        return Math.max(alturaEsq, alturaDir) + 1;
    }
}
