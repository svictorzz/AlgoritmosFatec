package filas;

public class TestePessoa{
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        System.out.println(p1);

        Pessoa p2 = new Pessoa("Ana");
        System.out.println(p2);

        Pessoa p3 = new Pessoa("Gil", 1999);
        System.out.println(p3);

    }
}