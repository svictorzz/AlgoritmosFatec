package pilhas.pilha_sobre_vetor;

import static pilhas.pilha_sobre_vetor.Pilha.esvaziarMenor;

public class PilhaTrabalho {
    public static void main(String[] args) {
        Pilha p1 = new Pilha();
        Pilha p2 = new Pilha();

        p1.empilha(1);
        p1.empilha(2);
        p2.empilha(3);
        p2.empilha(4);
        p2.empilha(5);

        System.out.println("Pilha 1 antes: \n" + p1);
        System.out.println("Pilha 2 antes: \n" + p2);

        esvaziarMenor(p1, p2);

        System.out.println("Pilha 1 depois: \n" + p1);
        System.out.println("Pilha 2 depois: \n" + p2);

    }
}
