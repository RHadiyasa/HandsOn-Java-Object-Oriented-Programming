package rafi.hadiyasa.static_class;

public class OuterClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class InnerClass{
        private String name;
        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
