package rafi.hadiyasa.encapsulation;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Honda","Brio",2020);

        // Mengambil data menggunakan Getter
        System.out.println("Brand : " + car.getBrand());
        System.out.println("Car Name : " + car.getName());
        System.out.println("Year : " + car.getYear());

        System.out.println("-".repeat(50));
        System.out.println("UBAH DATA");
        System.out.println("-".repeat(50));

        // Mengakses/mengubah data menggunakan setter
        car.setBrand("M"); // Tidak bisa karena panjang karakter kurang dari sama dengan 3
        car.brand = "M"; // Langsung berubah karena attribute brand adalah public
        car.setName("C63 AMG");
        car.setYear(2010);
        System.out.println("Brand : " + car.getBrand());
        System.out.println("Car Name : " + car.getName());
        System.out.println("Year : " + car.getYear());
    }
}
