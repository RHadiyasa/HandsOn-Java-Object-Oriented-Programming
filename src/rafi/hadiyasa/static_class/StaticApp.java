package rafi.hadiyasa.static_class;

import static rafi.hadiyasa.static_class.Application.PROCESSOR;
import static rafi.hadiyasa.static_class.Static.*;
// Import inner class langsung
import rafi.hadiyasa.static_class.OuterClass.InnerClass;

public class StaticApp {
    public static void main(String[] args) {
        // Block Static
        System.out.println("Available Processor : " + PROCESSOR);

        // Static Attribute
        System.out.println("Name : " + NAME);
        System.out.println("Version : " + VERSION);

        // Static Method
        System.out.println("Total : " + sum(1,2,3,4,5,6));

        // Static Class
        // Kita tidak perlu melakukan instance InnerClass seperti sebelumnya.
        InnerClass innerClass = new InnerClass();
        innerClass.setName("This is inner class");
        System.out.println("Inner Class : " + innerClass.getName());
    }
}
