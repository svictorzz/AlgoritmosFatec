package strings;

public class InsertStringBuffer {
    public static void main(String[] args){
        StringBuffer strBuffer = new StringBuffer(" StringBuffer");
        String str = "Fatec Carapicuiba ";
        strBuffer.insert(0, str);
        System.out.println(strBuffer);
        strBuffer.insert(str.length(), 2023);
        System.out.println(strBuffer);

    }
}
