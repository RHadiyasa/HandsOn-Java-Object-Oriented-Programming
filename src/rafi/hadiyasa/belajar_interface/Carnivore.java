package rafi.hadiyasa.belajar_interface;

public interface Carnivore extends Mammals, Vertebrates {
    void getName();
    void getHabitat();
    void getRun();
    int getLegs();
    boolean isHasFur();
}
