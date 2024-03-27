package rafi.hadiyasa.application.inheritance;

public class Carnivore extends Mammals {

    String carnivoreType;

    public Carnivore(String mammalsType, String carnivoreType) {
        super(mammalsType);
        this.carnivoreType = carnivoreType;
    }

    public void eat(String food) { //Overriding method eat from parent
        System.out.println(carnivoreType + " adalah " + super.mammalsType + " dan makan " + food);
    }

    public void info() {
        System.out.println("Ini adalah info " + super.mammalsType + " : " + carnivoreType);
    }

    // Contoh Super Keyword
    public void infoMammals() {
        super.info();
    }
}
