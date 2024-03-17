package lista_ligada;

public class ListaUltimo extends Lista{
	
	private No ultimo;
	
	@Override
	public void insereInicio(int i) {
		No novo = new No(i, null);
		if(estaVazia()) {
			ultimo = novo;
		}else {
			novo.setProximo(super.getPrimeiro());
		}
		super.setPrimeiro(novo);
	}

	@Override
	public void insereFim(int i) {
		No novo = new No(i, null);
		if (estaVazia()) {
			super.setPrimeiro(novo);
		} else {
			No aux = super.getPrimeiro();
			while(aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}
}
