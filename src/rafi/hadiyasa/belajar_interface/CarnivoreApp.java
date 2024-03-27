package rafi.hadiyasa.belajar_interface;

public class CarnivoreApp {
    public static void main(String[] args) {
        Lion lion = new Lion("Singa", "Savannah", "Melahirkan");
        lion.getName();
        lion.getHabitat();
        lion.getLegs();
        lion.getRun();
        lion.getBirth();
        System.out.println("Bertulang belakang : " + lion.isVertebrates());

        System.out.println("-".repeat(50));

        Dolphin dolphin = new Dolphin("Lumba lumba","Lautan","Melahirkan");
        dolphin.getName();
        dolphin.getHabitat();
        dolphin.getLegs();
        dolphin.getRun();
        dolphin.getBirth();
        System.out.println("Bertulang belakang : " + dolphin.isVertebrates());

    }
}
