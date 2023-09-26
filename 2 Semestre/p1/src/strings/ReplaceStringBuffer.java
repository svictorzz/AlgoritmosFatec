package strings;

public class ReplaceStringBuffer {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("fatec Caraca");
        System.out.println(str);
        str.replace(6, 12,"Carapicuiba");
        str.setCharAt(0, 'F');
        System.out.println(str);
    }
}
