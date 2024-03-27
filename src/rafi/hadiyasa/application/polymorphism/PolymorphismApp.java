package rafi.hadiyasa.application.polymorphism;

import rafi.hadiyasa.application.inheritance.Carnivore;
import rafi.hadiyasa.application.inheritance.CarnivoreSpecies;
import rafi.hadiyasa.application.inheritance.Herbivore;
import rafi.hadiyasa.application.inheritance.Mammals;

public class PolymorphismApp {
    public static void main(String[] args) {

        System.out.println("-".repeat(50));
        System.out.println("Polymorphism");
        System.out.println("-".repeat(50));

        Mammals mammals = new Mammals("Karnivora");
        mammals.eat("Daging");

        mammals = new Carnivore("Karnivora","Kucing");
        mammals.eat("Daging");

        mammals = new Herbivore("Herbivora","Kuda");
        mammals.eat("Rumput");

        mammals = new CarnivoreSpecies("Karnivora","Kucing Angora");
        mammals.eat("Whiskas");


        System.out.println("-".repeat(50));
        System.out.println("Method Mammals");
        System.out.println("-".repeat(50));
        eat(new CarnivoreSpecies("Karnivora",null));
        eat(new Carnivore("Karnivora",null));
        eat(new Herbivore("Herbivora",null));
        eat(new Mammals("Herbivora"));

        System.out.println("-".repeat(50));
        System.out.println("Casting Data Type");
        System.out.println("-".repeat(50));
        infoAnimal(new Mammals("Omnivora"));
        infoAnimal(new Carnivore("Karnivora",null));
        infoAnimal(new CarnivoreSpecies("Spesies Karnivora",null));
    }

    static void eat(Mammals mammals){
        System.out.println("Halo ini : " + mammals.mammalsType);
    }

    static void infoAnimal(Mammals mammals){
        if (mammals instanceof CarnivoreSpecies){
            CarnivoreSpecies carnivoreSpecies = (CarnivoreSpecies) mammals;
            System.out.println("Carnivore Species : " + carnivoreSpecies.mammalsType);
        } else if (mammals instanceof Carnivore){
            Carnivore carnivore = (Carnivore) mammals;
            System.out.println("Carnivore : " + carnivore.mammalsType);
        } else {
            System.out.println("Mammals : " + mammals.mammalsType);
        }
    }
}
