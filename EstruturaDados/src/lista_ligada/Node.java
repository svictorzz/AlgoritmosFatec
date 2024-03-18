package lista_ligada;


public class Node {

	private int info;
	private Node proximo;

	public Node(int info, Node proximo) {
		setInfo(info);
		setProximo(proximo);
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "|" + info + "|->";
	}
}
