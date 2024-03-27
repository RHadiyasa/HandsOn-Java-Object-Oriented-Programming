package rafi.hadiyasa.abstraction;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() { // Implement abstract method and override
        System.out.println(name + " menggonggong!");
    }
}
