public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println(person.toString()); // Default
        System.out.println(person1);
        System.out.println(person2);

        Object.class.hashCode();
        boolean isEqual = person1 == person2;
        System.out.println(isEqual);
    }
}
