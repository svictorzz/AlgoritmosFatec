package ordenacao;

public class TesteRandomico {
	public static void main(String[] args) {

		NossoVetor vetor = new NossoVetor(6);
		vetor.preencheVetor();
		vetor.insereEmPosicao(199,2);
		System.out.println(vetor);
		vetor.esvaziar();
		System.out.println(vetor);

	}
}
