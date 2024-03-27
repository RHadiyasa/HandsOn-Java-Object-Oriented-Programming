package rafi.hadiyasa.belajar_interface;

import java.sql.SQLOutput;

public class Lion implements Carnivore {
    String name;
    String habitat;
    String birth;

    public Lion(String name, String habitat, String birth) {
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
        System.out.println("Running fast");
    }

    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public boolean isHasFur() {
        return true;
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
