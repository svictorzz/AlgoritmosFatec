package p1;

import java.util.Random;
public class MeuVetor {
    private int ultPos;
    private double[] dados;

    public MeuVetor (int capacidade){
        ultPos = -1;
        dados = new double[capacidade];
    }

    // metodos de acesso
    public int getUltPos(){
        return ultPos;
    }

    public double[] getDados(){
        return dados;
    }

    //metodos modificadores
    public void setUltPos(int pos){
        if (pos >= 0 && pos < dados.length){
            ultPos = pos;
        } else {
            ultPos = dados.length - 1;
        }
    }

    @Override
    public String toString(){
        String s = "";
        if (estaVazio())
            s = s +  "vetor vazio.";
         else
            for (int i = 0; i <= ultPos; i++)
                s = s + String.format("%.0f ", dados[i]);
        return s + "\n";
    }

    public boolean estaCheio(){
        return ultPos == dados.length - 1;
    }

    public boolean estaVazio(){
        return  ultPos == -1;
    }

    private void redimensiona(int novaCapacidade){
        double[] temp = new double[novaCapacidade];
        for (int i = 0; i<= ultPos; i++){
            temp[i] = dados[i];
        }
        dados = temp;
    }

    public void adiciona (int e){
        if (estaCheio()) redimensiona(dados.length * 2);
        dados[++ultPos] = e;
    }

    public double remove(){
        if (estaVazio()) return -1;
        double aux = dados[ultPos--];
        if (dados.length >= 10 && ultPos <= dados.length / 4)
            redimensiona(dados.length / 2);
        return aux;
    }

    public void preencheVetor(){
        Random r = new Random();
        for (int i = 0; i < dados.length; i++){
            adiciona(r.nextInt(dados.length * 10) + 1);
        }
    }

    public void esvaziaVetor(){
        ultPos = -1;
        dados = new double[dados.length];
    }

    //metodos de ordenacao

    // selection sort
    public void selectionSort(){
        for (int i = 0; i < dados.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < dados.length; j++){
                if (dados[j] < dados[min]) min = j;
            }
            double temp = dados[min];
            dados[min] = dados[i];
            dados[i] = temp;
        }
    }

    // insertion sort
    public void insertionSort(){
        for (int i = 1; i < dados.length; i++) {
            int j = i - 1;
            double temp = dados[i];
            while (j >= 0 && dados[j] > temp){
                dados[j + 1] = dados[j];
                j--;
            }
            dados[j + 1] = temp;
        }
    }

    public void bubbleSort(){
        for (int i = 1; i < dados.length; i++) {
            for (int j = 0; j < dados.length - 1; j++) {
                if (dados[j] > dados[j + 1]){
                    double temp = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = temp;
                }
            }
        }
    }

}
