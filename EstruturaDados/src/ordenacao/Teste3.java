package ordenacao;

public class Teste3 {
	public static void main(String[] args) {
		NossoVetor vetor = new NossoVetor(10);

		vetor.adiciona(10);
		vetor.adiciona(20);
		vetor.adiciona(39);
		vetor.adiciona(46);

		System.out.println("Vetor antes: " + vetor);
		vetor.esvaziar();
		System.out.println("Vetor depois: " + vetor);

	}
}
