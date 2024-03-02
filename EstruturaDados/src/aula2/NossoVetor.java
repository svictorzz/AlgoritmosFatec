package aula2;

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
    
    public void adiciona (double e){
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
    		adiciona(r.nextInt());
    	}
    }
}