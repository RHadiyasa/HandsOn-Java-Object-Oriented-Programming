package rafi.hadiyasa.innerclass;

public class AnonymousClassApp {
    public static void main(String[] args) {
        LocalLanguages sundanese = new LocalLanguages() {
            @Override
            public void languages() {
                System.out.println("Kumaha damang...");
            }
        };

        LocalLanguages javanese = new LocalLanguages() {
            @Override
            public void languages() {
                System.out.println("Piye kabare... ");
            }
        };

        System.out.println("Apakabar : ");
        sundanese.languages();
        javanese.languages();
    }
}
