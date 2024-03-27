package rafi.hadiyasa.innerclass;

import java.rmi.dgc.Lease;

public class ProvinceApp {
    public static void main(String[] args) {
        Province capitalCity = new Province();
        capitalCity.setName("DKI Jakarta");
        System.out.println(capitalCity.getName());
        capitalCity.getDistrictName();

        Province eastJava = new Province();
        eastJava.setName("Jawa Timur");
        System.out.println(eastJava.getName());

        // Membuat object dari inner class di Main class
        Province.District malang = eastJava.new District();
        malang.setName("Kota Malang");
        malang.districtName();

        Province.District madiun = eastJava.new District(); // Akses nama Provinsi dari eastJava
        madiun.getProvinceName();
        madiun.setName("Madiun");
        madiun.districtName();

        System.out.println("-".repeat(50));
        System.out.println("Anonymous Class");
        LocalLanguages javanese = new LocalLanguages() {
            @Override
            public void languages() {
                System.out.println("Piyekabare...");
            }
        };
    }
}
