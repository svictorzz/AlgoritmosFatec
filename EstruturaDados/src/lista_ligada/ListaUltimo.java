package lista_ligada;

public class ListaUltimo extends Lista{
	
	private Node ultimo;
	
	@Override
	public void insereInicio(int i) {
		Node novo = new Node(i, null);
		if(estaVazia()) {
			ultimo = novo;
		}else {
			novo.setProximo(super.getPrimeiro());
		}
		super.setPrimeiro(novo);
	}

	@Override
	public void insereFim(int i) {
		Node novo = new Node(i, null);
		if (estaVazia()) {
			super.setPrimeiro(novo);
			ultimo = novo;
		} else {
			ultimo.setProximo(novo);
			ultimo = novo;
		}
	}
}
