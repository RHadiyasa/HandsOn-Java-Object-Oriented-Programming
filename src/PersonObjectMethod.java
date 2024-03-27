public class PersonObjectMethod {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Rafi";
        person1.sayHello("Agus");
        person1.sayHelloAgain("Wahyu");

        person2.name = "Manda";
        person2.sayHello("Dwi");
    }
}
