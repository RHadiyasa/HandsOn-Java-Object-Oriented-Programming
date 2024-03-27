package rafi.hadiyasa.static_class;

public class Static {
    public static final String NAME = "Enigma Camp";
    public static final int VERSION = 1;

    public static int sum(int... values) {
        int total = 0;

        for (int value : values) {
            total = total + value;
        }
        return total;
    }
}
