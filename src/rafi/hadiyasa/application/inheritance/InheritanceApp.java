package rafi.hadiyasa.application.inheritance;

public class InheritanceApp {
    public static void main(String[] args) {
        Mammals mammals =  new Mammals("Herbivora");
        mammals.eat("Tumbuhan");

        Herbivore zebra = new Herbivore("Herbovira", "Zebra");
        zebra.eat("Rumput");

        //-----------------------------------------//
        System.out.println("-".repeat(50));

        Carnivore cat = new Carnivore("Karnivora", "Kucing");
        cat.info(); // Informasi Karnivora
        cat.infoMammals(); // Informasi Mamalia
        cat.eat("Daging");

    }
}
