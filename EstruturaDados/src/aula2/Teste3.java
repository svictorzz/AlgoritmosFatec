package aula2;

public class Teste3 {
	public static void main(String[] args) {
		
		NossoVetor vetor = new NossoVetor(5);
		
		for (int i = 1; i <= 100; i++) {
			vetor.adiciona(i);
			System.out.println("inseriu " + i + ", capacidade = " + vetor.getDados().length);
		}
		while(!vetor.estaVazio()) {
			System.out.println(vetor.remove() + " foi atendido, nova capacidade"
					+ " = " + vetor.getDados().length);
		}
		for (int i = 1; i <= 100; i++) {
			vetor.adiciona(i);
			System.out.println("inseriu " + i + ", capacidade = " + vetor.getDados().length);
		}
	}

}
