package strings;

public class Concatenando {
    public static void main(String[] args) {
        String nome = "Victor";
        String sobrenome = "Souza";

        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Nome completo: ".concat(nome).concat(" ").concat(sobrenome));
        System.out.println(String.format("%s %s %s", "Nome completo:", nome, sobrenome));
    }
}
