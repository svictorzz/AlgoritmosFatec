package strings;

public class AppendStringBuffer {
    public static void main(String[] args) {
        StringBuffer str= new StringBuffer("Fatec ");
        str.append("Carapicuiba ");
        str.append(2023);
        char array[] = "Aula de Strings ".toCharArray();
        System.out.println("1- " + str);
        str.append(array, 7, 9);
        System.out.println("2- " + str);
        str.append(array, 6, 8);
        System.out.println("3- " + str);
        str.append("Buffer");
        System.out.println("4- " + str);

    }
}
