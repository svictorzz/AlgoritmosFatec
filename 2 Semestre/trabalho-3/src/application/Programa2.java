package application;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        try {
            while (true) {
                System.out.print("Digite um nome (ou 'sair' para encerrar): ");
                String nome = scanner.nextLine();

                if (nome.equalsIgnoreCase("sair")) {
                    break;
                }

                adicionarNome(nomes, nome);
            }

            System.out.print("Digite um índice para acessar um nome na lista: ");
            int indice = scanner.nextInt();
            acessarNome(nomes, indice);
        } catch (NoSuchElementException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Programa encerrado.");
        }
    }

    public static void adicionarNome(List<String> lista, String nome) {
        lista.add(nome);
    }

    public static void acessarNome(List<String> lista, int indice) throws NoSuchElementException {
        if (indice < 0 || indice >= lista.size()) {
            throw new NoSuchElementException("Índice fora dos limites da lista.");
        }

        String nome = lista.get(indice);
        System.out.println("Nome no índice " + indice + ": " + nome);
    }

}

