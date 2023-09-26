package strings;

public class OcorrenciaString {
    public static void main(String[] args) {
        String str = "Fatec Carapicuiba";

        System.out.println(str.indexOf("ra"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("ra", 10));
        System.out.println(str.indexOf("a", 10));
        System.out.println(str.lastIndexOf("ra"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.toLowerCase().startsWith("fatec"));
        System.out.println(str.startsWith("Ca", 6));
    }
}
