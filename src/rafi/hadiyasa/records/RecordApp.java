package rafi.hadiyasa.records;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("username", "password");
        LoginRequest loginRequest1 = new LoginRequest("username", "password");

        // Method getter
        System.out.println("Username : " + loginRequest.username());
        System.out.println("Password : " + loginRequest.password());

        // Method hashCode
        System.out.println("hashCode loginRequest  : " + loginRequest.hashCode());
        System.out.println("hashCode loginRequest1 : " + loginRequest1.hashCode());

        // Method equals
        System.out.println("Equals : " + loginRequest.equals(loginRequest1)); // true

        // Method toString automatis dibuat
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("rafi"));
        System.out.println(new LoginRequest("rafihadiyasa","pass"));
    }
}
