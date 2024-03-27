package rafi.hadiyasa.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Iphone 14 Pro",15000000);
        Product product2 = new Product("Iphone 14 Pro",15000000);

//        System.out.println("Nama : " + product.name);
//        System.out.println("Harga : " + product.price);

//        System.out.println(product);
//        System.out.println(product.toString());
        System.out.println("-".repeat(50));
        System.out.println(product.equals(product2)); // true
        // Maka
        System.out.println("Product Hash Code: " + product.hashCode());
        System.out.println("Product2 Hash Code: " + product2.hashCode());
        System.out.println(product.hashCode() == product2.hashCode()); // True juga

        Product product3 = new Product("Samsung1",1000);
        Product product4 = new Product("Samsung2",1000);

        System.out.println("Product 3 hashCode : " + product3.hashCode());
        System.out.println("Product 4 hashCode : " + product4.hashCode());
        System.out.println("Berdasarkan equals() : " + product3.equals(product4));


        System.out.println("-".repeat(50));

        System.out.println(product == product2);
        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());

        System.out.println("To String");
        System.out.println(product.toString());
        System.out.println(product2.toString());
        System.out.println("HashCode");
        System.out.println(product.hashCode());
        System.out.println(product2.hashCode());
    }
}
