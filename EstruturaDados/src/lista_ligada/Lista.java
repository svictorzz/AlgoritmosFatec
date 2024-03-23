package lista_ligada;

public class Lista {
	
	private Node primeiro;
	
	public Node getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(Node primeiro) {
		this.primeiro = primeiro;
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	public void insereInicio(int i) {
		Node novo = new Node(i, null);
		if (!estaVazia()) {
			novo.setProximo(primeiro);
		}
		primeiro = novo;
	}
	
	public void insereFim(int i) {
		Node novo = new Node(i, null);
		if (estaVazia()) {
			primeiro = novo;
		} else {
			Node aux = primeiro;
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}

	public int removeInicio(){
		int info = primeiro.getInfo();
		primeiro = primeiro.getProximo();
		return info;
	}

	public int removeFim(){
		int temp;
		if (primeiro.getProximo() == null){
			temp = primeiro.getInfo();
			primeiro = null;
		} else {
			Node aux = primeiro;
			while(aux.getProximo().getProximo() != null){
				aux = aux.getProximo();
			}
			temp = aux.getProximo().getInfo();
			aux.setProximo(null);
		}
		return temp;
	}

	@Override
	public String toString() {
		String s = "lista: ";
		if(estaVazia()) {
			s = s + "está vazia.";
		} else {
			Node aux = primeiro;
			while(aux != null) {
				s = s + aux;
				aux = aux.getProximo();
			}
			s = s + "\\\\";
		}
		return s;
	}
	
}
