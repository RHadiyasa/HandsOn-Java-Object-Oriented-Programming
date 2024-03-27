public class PersonFieldManipulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Rafi Hadiyasa";
        person.gender = "Pria";
        person.age = 24;

        System.out.println("Nama : " + person.name);
        System.out.println("Gender : " + person.gender);
        System.out.println("Umur : " + person.age);
        System.out.println("Negara : " + person.country);
    }
}
