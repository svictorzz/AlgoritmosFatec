package lista_ligada;

public class Lista {
	
	private No primeiro;
	
	public No getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	public void insereInicio(int i) {
		No novo = new No(i, null);
		if (!estaVazia()) {
			novo.setProximo(primeiro);
		}
		primeiro = novo;
	}
	
	public void insereFim(int i) {
		No novo = new No(i, null);
		if (estaVazia()) {
			primeiro = novo;
		} else {
			No aux = primeiro;
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}
	
	@Override
	public String toString() {
		String s = "lista: ";
		if(estaVazia()) {
			s = s + "está vazia.";
		} else {
			No aux = primeiro;
			while(aux != null) {
				s = s + aux;
				aux = aux.getProximo();
			}
			s = s + "\\\\";
		}
		return s;
	}
	
}
