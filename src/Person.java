public class Person {
    String name;
    String gender;
    int age;
    final String country = "Indonesia";

    void sayHello(String friend){ //Shadowing parameter
        System.out.println("Halo " + friend + ", My name is " + name);
    }
    void sayHelloAgain(String name){ //Shadowing parameter
        System.out.println("Halo " + name + ", My name is " + this.name);
    }
}
