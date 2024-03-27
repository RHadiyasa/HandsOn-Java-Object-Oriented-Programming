package rafi.hadiyasa.abstraction;

public class AnimalApp {
    public static void main(String[] args) {
        Animal dog = new Dog("Moly");
        dog.sound();
        dog.sleep();

        Animal cat = new Cat("Marissa");
        cat.sound();
        cat.sleep();
    }
}
