package rafi.hadiyasa.application.inheritance;

public class Mammals {
    public String mammalsType;

    public Mammals(String mammalsType){
        this.mammalsType = mammalsType;
    }

    public void eat(String food){
        System.out.println(mammalsType + " makan " + food);
    }

    public void info(){
        System.out.println("Ini adalah info : " + mammalsType);
    }
}


















