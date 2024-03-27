public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Honda","City");
        Car car2 = new Car("Toyota","Avanza");
        System.out.println("Car 1 : " + car1.brand + " " + car1.name);
        System.out.println("Car 2 : " + car2.brand + " " + car2.name);

        // Manggil constructor yang parameternya 1 (Brand)
        Car car3 = new Car("Honda");
        car3.name = "Brio";
        System.out.println("Car 3 : " + car3.brand + " " + car3.name);

        // Panggil constructor tanpa parameter
        Car car4 = new Car();
        car4.brand = "Wuling";
        car4.name = "Almaz";
        System.out.println("Car 4 : " + car4.brand + " " + car4.name);
    }
}
