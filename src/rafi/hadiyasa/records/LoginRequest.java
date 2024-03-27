package rafi.hadiyasa.records;

public record LoginRequest(String username, String password) {

    public LoginRequest{ // otomatis dijalankan
        System.out.println("Membuat login request");
    }
    public LoginRequest(String username){
        this(username,"");
    }
    public LoginRequest(){
        this("","");
    }
}
