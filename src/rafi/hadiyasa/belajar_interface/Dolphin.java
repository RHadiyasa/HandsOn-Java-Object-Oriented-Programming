package rafi.hadiyasa.belajar_interface;

public class Dolphin implements Carnivore {
    String name;
    String habitat;
    String birth;

    public Dolphin(String name, String habitat, String birth) {
        this.name = name;
        this.habitat = habitat;
        this.birth = birth;
    }

    @Override
    public void getName() {
        System.out.println("Nama : " + name);
    }

    @Override
    public void getHabitat() {
        System.out.println("Habitat : " + habitat);
    }

    @Override
    public void getRun() {
        System.out.println("Swimming");
    }

    @Override
    public int getLegs() {
        return 0;
    }

    @Override
    public boolean isHasFur() {
        return false;
    }

    @Override
    public void getBirth() {
        System.out.println("Berkembang biak : " + birth);
    }

    @Override
    public boolean isVertebrates() {
        return true;
    }
}
