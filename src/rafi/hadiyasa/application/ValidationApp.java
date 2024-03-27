package rafi.hadiyasa.application;

import rafi.hadiyasa.error.ValidationException;
import rafi.hadiyasa.records.LoginRequest;
import rafi.hadiyasa.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null,"password");
        ValidationUtil.validateRuntime(loginRequest);
        /*try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid!");
        } catch (ValidationException e){
            System.out.println("Data is not valid : " + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Data Null : " + e.getMessage());
        } finally {
            System.out.println("I don't care there's exception or not ^^, I'll run!");
        }*/
    }
}
