package filas;

public class TestePessoa{
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        System.out.println(p1);

        Pessoa p2 = new Pessoa("Ana");
        System.out.println(p2);

        Pessoa p3 = new Pessoa("Gil", 1999);
        System.out.println(p3);

        Pessoa[] namoradas = {
                new Pessoa("Graciella", 2001),
                new Pessoa("Camilly", 2002),
                new Pessoa("Julia", 2004)
        };

        Pessoa[] inimigos = {
                new Pessoa("Lucas", 1991),
                new Pessoa("Daniel", 1993),
                new Pessoa("Carlos", 1995),
                new Pessoa("Gabriel", 1996)
        };

        Pessoa[] depressao = Fila.intercalar(namoradas, inimigos);

        System.out.println("Vetor Intercalado:");
        for (Pessoa p : depressao) {
            System.out.println(p);
        }

    }
}