package rafi.hadiyasa.application.VariableHiding;

public class VariableHidingApp {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.info();

        Child child = new Child();
        child.info();

        System.out.println("-".repeat(50));

        Parent newParent = (Parent) child;
        newParent.info();
        System.out.println(newParent.name);

//        Error ClassCastException
//        Java mengira bahwa object parent itu instance dari Child.
//        Padahal parent itu instance dari Parent
//        Child newChild = (Child) parent;
//        newChild.info();
//        System.out.println(newChild.name);

        // DOWN CASTING
        System.out.println("-".repeat(50));
        System.out.println("Downcasting");
        System.out.println("-".repeat(50));

        parent = new Child();
        parent.info();

        Child newChildLagi = (Child) parent;
        newChildLagi.info();

        Parent newParentLagi = new Parent();
        newParentLagi.info();

//        Error
//        Child newChild1 = (Child) newParentLagi;
//        newChild1.info();

    }
}
