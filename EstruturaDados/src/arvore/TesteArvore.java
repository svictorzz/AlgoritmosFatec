package arvore;

import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 12;
        ArvoreBinaria abb = new ArvoreBinaria();
        System.out.println("a lista de valores: ");
        for(int i = 2; i<n; i++){
            int x = r.nextInt(n*10) + 1;
            abb.insere(x);
            System.out.print(x + " ");
        }
        System.out.println("\nA arvore: ");
        System.out.println(abb.toStringEmOrdem());
        System.out.println("Maior: " + abb.maior());
        System.out.println("Menor: " + abb.menor());
        System.out.println("Numero nos: " + abb.numNos());
        System.out.println(abb.busca(11));
        System.out.println(abb.ehBalanceada());

    }   
}
