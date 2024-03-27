package rafi.hadiyasa.abstraction;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() { // Implement abstract method and override
        System.out.println(name + " meongg meongg...");
    }
}
