package strings;

public class ComparaStrings {
    public static void main(String[] args) {
        String st1 = new String("Fatec"), st2 = "Fatec", st3 = "fatec";

        System.out.println("st1: " + st1 + "\n" + "st2: " + st2 + "\n" + "st3: " + st3);
        System.out.println("st1 == st2: " + (st1 == st2));
        System.out.println("st1.equals(st2): " + st1.equals(st2));
        System.out.println("st1.equals(st3): " + st1.equals(st3));
        System.out.println("st1.equals(st3): " + st1.equalsIgnoreCase(st3));
        System.out.println("st1.compareTo(st2): " + st1.compareTo(st2));
        System.out.println("st1.compareTo(st3): " + st1.compareTo(st3));
        System.out.println("st3.compareTo(st2): " + st3.compareTo(st2));
        System.out.println("st3.compareToIgnoreCase(st2): " + st3.compareToIgnoreCase(st2));
    }
}
