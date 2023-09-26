package strings;

public class DeleteStringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Fatec Praia Grande");
        System.out.println(str);
        str.delete(7, 11);
        System.out.println(str);
        str.delete(9, 14);
        System.out.println(str);
        str.deleteCharAt(7);
        System.out.println(str);

    }
}
