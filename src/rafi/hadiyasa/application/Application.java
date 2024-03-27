package rafi.hadiyasa.application;

import rafi.hadiyasa.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Iphone 12 Pro Max", 10000000);
        System.out.println("Nama : " + product.name);
        System.out.println("Harga : " + product.price);
    }
}
