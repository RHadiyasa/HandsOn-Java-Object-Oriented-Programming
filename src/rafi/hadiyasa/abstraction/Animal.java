package rafi.hadiyasa.abstraction;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract Method
    public abstract void sound();

    // Non-abstract method
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
