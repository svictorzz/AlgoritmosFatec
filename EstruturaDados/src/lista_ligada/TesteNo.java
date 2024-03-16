package lista_ligada;

public class TesteNo {

	public static void main(String[] args) {
		No no1 = new No(10, null);
		No no2 = new No(20, null);
		
		System.out.println("no1: " + no1);
		System.out.println("no2: " + no2);
		
		no1.setProximo(no2);
		System.out.println("e agora??? " + no1.getProximo());

	}

}
