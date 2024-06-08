package filas.fila_sobre_lista;

import filas.Pessoa;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Pessoa p1 = new Pessoa("Alex");
        Pessoa p2 = new Pessoa("Bob");
        Pessoa p3 = new Pessoa("Maria");

        fila.enfileira(p1);
        fila.enfileira(p2);
        fila.enfileira(p3);

        System.out.println("Fila atual: " + fila);

        System.out.println("Posição de Alex: " + fila.posicaoDeElemento(p1)); // Deve retornar 0
        System.out.println("Posição de Bob: " + fila.posicaoDeElemento(p2));   // Deve retornar 1
        System.out.println("Posição de Maria: " + fila.posicaoDeElemento(p3)); // Deve retornar 2

        Pessoa p4 = new Pessoa("Marco");
        System.out.println("Posição de Marco: " + fila.posicaoDeElemento(p4)); // Deve retornar -1 (não encontrado)
    }
}
