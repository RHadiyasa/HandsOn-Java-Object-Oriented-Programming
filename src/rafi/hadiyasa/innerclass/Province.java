package rafi.hadiyasa.innerclass;

public class Province { // Outer Class
    String name;
    public String getName() {
        return "Nama Provinsi : " + name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public class District { // Inner Class
        String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        void getProvinceName(){
            System.out.println("Nama Provinsi : " + Province.this.name);
        }

        void districtName(){
            System.out.println("Nama Kabupaten : " + name);
        }
    }

    public void getDistrictName(){
        District district = new District();
        district.setName("Jakarta Selatan");
        district.districtName();
    }
}
