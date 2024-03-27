package rafi.hadiyasa;

public class Equals {
    public static void main(String[] args) {
        String name1 = "Enigma";
        name1 = name1 + " "  + "Camp";

        String name2 = "Enigma Camp";

        String first = "Enigma";
        String second = "Camp";

        System.out.println(name1 == name2); // false
        System.out.println(first == second);
        System.out.println(name1.equals(name2));


    }
}
