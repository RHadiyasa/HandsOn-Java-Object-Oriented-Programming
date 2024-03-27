package rafi.hadiyasa.application.inheritance;

public class Herbivore extends Mammals{

    String herbivoreType;

    public Herbivore(String mammalsType, String herbivoreType){
        super(mammalsType);
        this.herbivoreType = herbivoreType;
    }

    @Override
    public void eat(String food) {
        System.out.println(herbivoreType + " adalah " + mammalsType + " dan makan " + food);
    }
}
