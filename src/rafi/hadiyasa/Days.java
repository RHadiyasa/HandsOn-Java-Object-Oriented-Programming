package rafi.hadiyasa;

public enum Days {
    MONDAY("Hari Ke-1"),
    TUESDAY("Hari Ke-2"),
    WEDNESDAY("Hari Ke-3"),
    THURSDAY("Hari Ke-4"),
    FRIDAY("Hari Ke-5"),
    SATURDAY("Weekend Ke-1"),
    SUNDAY("Weekend Ke-2");

    // Attribute
    private String desc;

    // Constructor
    Days(String desc){
        this.desc = desc;
    }

    // Method

    public String getDesc() {
        return desc;
    }
}
