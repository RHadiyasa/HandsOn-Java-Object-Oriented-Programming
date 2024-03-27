package rafi.hadiyasa.encapsulation;

public class Vehicle {
    public String brand;
    private String name;
    private int year;

    public Vehicle(String brand, String name, int year) {
        this.brand = brand;
        this.name = name;
        this.year = year;
    }

    // Getter for brand
    public String getBrand(){
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand){
        if (brand.length() >= 3 && name.length() >= 3){
            this.brand = brand;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3){
            this.name = name;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
