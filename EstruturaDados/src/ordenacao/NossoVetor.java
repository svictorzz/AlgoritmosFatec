package ordenacao;

import java.util.Random;

public class NossoVetor{
    private int ultimaPosicao;
    private double[] dados;

    public NossoVetor (int capacidade){
        ultimaPosicao = -1;
        dados = new double[capacidade];
    }

    //metodos de acesso 
    public double getUltimaPosicao(){
        return ultimaPosicao;
    }

    public double[] getDados(){
        return dados;
    }

    public int getComprimento(){
        return dados.length;
    }

    @Override
    public String toString(){
        String s = "";
        if(estaVazio()){
            s = s + "vetor vazio!";
        }
        else
            for (int i = 0; i<=ultimaPosicao; i++)
                s = s + String.format("%.0f ", dados[i]);
            return s + "\n";
        
    }

    public boolean estaCheio(){
        if(ultimaPosicao == dados.length-1){
            return true;
        }
        else{
            return false;
        }
        //return ultimaPosicao == dados.length-1; (mesma coisa que o cod acima)
    }

    public boolean estaVazio(){
        if(ultimaPosicao == -1){
            return true;
        }
        else{
            return false;
        }
    }

    private void redimensiona(int novaCapacidade){
        double[] temp = new double [novaCapacidade];
            for(int i =0; i<= ultimaPosicao; i++)
                temp[i] = dados[i];
            dados = temp;
    }

    public void adiciona (int e){
        if(estaCheio()){
            redimensiona(dados.length*2);
        }
        dados[++ultimaPosicao] = e;
    }

    public void adiciona (double e){
        if(estaCheio()){
            redimensiona(dados.length*2);
        }
        dados[++ultimaPosicao] = e;
    }

    public double remove(){
        if(estaVazio()){
            return -1;
        }
        double aux = dados[(int) ultimaPosicao--];
        if(dados.length >= 10 && ultimaPosicao <= dados.length/4){
            redimensiona(dados.length/2);
        }
        return aux;
    }

    //metodo para inserir valores randomicos no vetor
    public void preencheVetor(){
        Random r = new Random();
        for(int i = 0; i < dados.length; i++){
           adiciona(r.nextInt(dados.length*10) + 1);
        }
    }

    public int selectionSort(){
       int cont = 0;
        for(int i = 0; i < dados.length-1; i++){
            int min = i;

            for(int j = i + 1; j < dados.length; j++){
                cont++;
                if(dados[j] < dados [min]){
                    min = j;
                }
            }

            double temp = dados[min];
            dados[min] = dados[i];
            dados[i] = temp;
        }
        return cont;
    }

    public void insertionSort(){

        for (int j = 1; j < dados.length; ++j) {
            double x = dados[j];
            int i;
            for (i = j-1; i >= 0 && dados[i] > x; --i) {
               dados[i+1] = dados[i];
            }
            dados[i+1] = x;
         }
    }

    public void bubbleSort(){
        double aux = 0;
         for(int i=0; i < dados.length; i++){
                 for(int x=1; x < (dados.length-i); x++){
                          if(dados[x-1] > dados[x]){
                                 aux = dados[x-1];
                                 dados[x-1] = dados[x];
                                 dados[x] = aux;
                         }
                 }
         }
    }

    //1. Inserir um elemento em uma determinada posição
    public void insereEmPosicao(int elemento, int posicao) {
        if (estaCheio()) {
            redimensiona(dados.length * 2);
        } //verifica se está cheio, igual no metodo adiciona comum
        for (int i = ultimaPosicao; i >= posicao; i--) {
            dados[i + 1] = dados[i]; //mov e os elementos da esquerda pra direita 
        }
        dados[posicao] = elemento;
        ultimaPosicao++;
    }

    // 2. Verificar quantas vezes um elemento aparece no vetor
    public int contarOcorrencias(double elemento) {
        int contagem = 0;
        for (int i = 0; i <= ultimaPosicao; i++) {
            if (dados[i] == elemento) {
                contagem++;
            }
        }
        return contagem;
    }

    //3. Remover um elemento de uma determinada posição
    public double removeEmPosicao(int posicao) {
        if(estaVazio()){
            return -1;
        }
        double elementoRetirado = dados[posicao];
        for (int i = posicao; i < ultimaPosicao; i++) {
            dados[i] = dados[i+1];
        }
        ultimaPosicao--;
        return elementoRetirado;
    }

    //4. Remover a primeira ocorrência de um determinado elemento
    public void removePrimeiraOcorrencia(int elemento) {
        for (int i = 0; i <= ultimaPosicao; i++) {
            if (dados[i] == elemento) {
                removeEmPosicao(i);
            }
        }
    }

    //5. Remover todas as ocorrências de um determinado elemento
    public void removeTodasOcorrencias(int elemento) {
        for (int i = 0; i <= ultimaPosicao; ) {
            if (dados[i] == elemento) {
                removeEmPosicao(i);
            } else {
                i++;
            }
        }
    }

   // 8. Devolver o tamanho atual da lista de valores (quantos elementos ela tem)
    public int tamanho() {
        return ultimaPosicao + 1;
    }

    // 9. Esvaziar a lista.
    public void esvaziar(){
        ultimaPosicao = -1;
    }

    // 11. Reduzir o vetor ao tamanho dele
    public void reduzirTamanhoAtual(){
        int tamanhoAtual = ultimaPosicao + 1;
        double[] temp = new double[tamanhoAtual];
        for (int i = 0; i < tamanhoAtual; i++) {
            temp[i] = dados[i];
        }
        dados = temp;
    }


    //13. Somar os elementos do vetor
    public double somarElementos() {
        double soma = 0;
        for (int i = 0; i <= ultimaPosicao; i++) {
            soma = soma + dados[i];
        }
        return soma;
    }

    //14. Encontrar o maior elemento armazenado
    public double maiorElemento() {
        double maior = dados[0];
        for (int i = 1; i <= ultimaPosicao; i++) {
            if(dados[i] > maior){ 
                maior = dados[i]; 
            } 
        }
        return maior;
    }

    //15. Encontrar a posição do maior elemento armazenado
    public double maiorElementoPosicao() {
        double maior = dados[0];
        double posicaoMaior = 0;
        for (int i = 1; i <= ultimaPosicao; i++) {
            if(dados[i] > maior){ 
                maior = dados[i]; 
                posicaoMaior = i;
            } 
        }
        return posicaoMaior;
    }
}





