package lista_ligada;

public class TesteLista {
	public static void main(String[] args) {
		Lista lista = new Lista();
		Lista listaUltimo = new ListaUltimo();

		System.out.println(lista);
		System.out.println(listaUltimo);
		
		for(int i = 1; i < 10; i++) {
			lista.insereInicio(i * 10);
			System.out.println(lista);
		}
		System.out.println("---------------------------------------------------");

		for(int i = 1; i < 10; i++) {
			listaUltimo.insereInicio(i * 20);
			System.out.println(listaUltimo);
		}

		System.out.println("---------------------------------------------------");

		for(int i = 1; i < 6; i++) {
			lista.insereFim(i * 10 + 5);
			System.out.println(lista);
		}

		System.out.println("---------------------------------------------------");

		for(int i = 1; i < 6; i++) {
			listaUltimo.insereFim(i * 20 + 5);
			System.out.println(listaUltimo);
		}
	}
}
