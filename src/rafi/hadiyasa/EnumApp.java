package rafi.hadiyasa;

import rafi.hadiyasa.annotation.Description;

@Description(name = "EnumApp", tags = {"Application", "Java"})
public class EnumApp {
    public static void main(String[] args) {
        WorkdayEmployee workdayEmployee = new WorkdayEmployee();
        workdayEmployee.setName("Rafi Hadiyasa");
        workdayEmployee.setDay(Days.TUESDAY);

        System.out.println("Nama : " + workdayEmployee.getName());
        System.out.println("Hari kerja : " + workdayEmployee.getDay().getDesc()
                + " Atau " + workdayEmployee.getDay());


        // Konversi Enum ke String
        String dayName = Days.SUNDAY.name(); // disimpan pada variable dayName dengan tipe data String
        System.out.println(dayName);

        // Konversi String menjadi Enum
        Days days = Days.valueOf("MONDAY"); // disimpan pada variable days dengan tipe data Days(ENUM)
        System.out.println(days);

        // Cetak semua ENUM
        System.out.println("--ENUM--");
        Days[] daysArray = Days.values();
        for (Days day : daysArray){
            System.out.println(day);
        }
    }
}
