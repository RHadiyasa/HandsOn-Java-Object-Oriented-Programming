package rafi.hadiyasa.static_class;

public class Application {
    public static final int PROCESSOR;

    static {
        System.out.println("This is static block!");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
