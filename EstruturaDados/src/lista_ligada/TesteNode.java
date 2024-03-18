package lista_ligada;

public class TesteNode {

	public static void main(String[] args) {
		Node node1 = new Node(10, null);
		Node node2 = new Node(20, null);

		System.out.println("no1: " + node1);
		System.out.println("no2: " + node2);

		node1.setProximo(node2);
		System.out.println("e agora??? " + node1.getProximo());
	}
}
