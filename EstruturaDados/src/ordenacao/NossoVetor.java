package ordenacao;

import java.util.Random;

public class NossoVetor {
	
    private int ultPos;
    private double[] dados;
    
    public NossoVetor (int capacidade){
        ultPos = -1;
        dados = new double[capacidade];
    }
    
    //métodos de acesso
    public int getUltPos(){
        return ultPos;
    }
    public double[] getDados(){
        return dados;
    }
    
    //métodos modificadores
    public void setUltPos(int pos){
        if (pos>=0 && pos < dados.length){
            ultPos = pos;
        }
        else{
            ultPos = dados.length-1;
        }
    }
    
    @Override
    public String toString(){
        String s = "";
        if (estaVazio()) 
			s = s + "vetor vazio";
        else
        	for (int i = 0; i <= ultPos;i++)
        		s = s + String.format("%.0f ", dados[i]);
        return s + "\n";
    }
    
    public boolean estaCheio(){
        return ultPos == dados.length - 1;
    }
    
    public boolean estaVazio(){
        return ultPos == -1;
    }
    
    private void redimensiona (int novaCapacidade) {
    	double[] temp = new double[novaCapacidade];
    	for (int i = 0; i <= ultPos; i++) {
    		temp[i] = dados[i];
    	}
    	dados = temp;
    }
    
    public void adiciona (int e){
        if(estaCheio()) redimensiona(dados.length * 2);
        dados[++ultPos] = e;
    }

    public double remove(){
        if (estaVazio()) return -1;
        double aux = dados[ultPos--];
        
        if (dados.length >= 10 && ultPos <= dados.length / 4) 
        	redimensiona(dados.length / 2);
        return aux;
      }
    
    // metodo para inserir valores randomicos no vetor
    public void preencheVetor () {
    	Random r = new Random();
    	for (int i = 0; i < dados.length; i++) {
    		// adiciona(Math.random());
    		// adiciona(r.nextDouble());
    		adiciona(r.nextInt(dados.length * 10) + 1);
    	}
    }

    public void esvaziaVetor() {
        ultPos = -1;
        dados = new double[dados.length];
    }
    
 // metodos de ordenação
    
    // Selection sort
    public void selectionSort() {
    	//int cont = 0;
    	for(int i = 0; i < dados.length - 1; i++) {
    		int min = i;
    		for(int j = i + 1; j < dados.length; j++) {
    			//cont++;
    			if(dados[j] < dados[min]) min = j;
    		}
    		double temp = dados[min];
    		dados[min] = dados[i];
    		dados[i] = temp;
    	}
    	// return cont;
    }

    // Insertion sort
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

    // Bubble sort
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

    // Quick sort

    private int partition(int p, int r){
        double pivot = dados[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (dados[j] <= pivot){
                i++;
                double temp = dados[i];
                dados[i] = dados[j];
                dados[j] = temp;
            }
        }
        double temp = dados[i+ 1];
        dados[i + 1] = dados[r];
        dados[r] = temp;
        return i + 1;
    }
    public void quickSort(int p, int r){
        if (p < r){
            int q = partition(p,r);
            quickSort(p, q-1);
            quickSort(q+1, r);
        }
    }
}