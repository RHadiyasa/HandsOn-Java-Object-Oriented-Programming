package rafi.hadiyasa.belajar_interface;

public interface Vertebrates {
    boolean isVertebrates();

    default boolean isLive(){
        return true;
    };
}
