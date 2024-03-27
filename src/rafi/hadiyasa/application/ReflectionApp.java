package rafi.hadiyasa.application;

import rafi.hadiyasa.data.CreateUserRequest;
import rafi.hadiyasa.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();

        request.setUsername("username");
        request.setPassword("password");
        ValidationUtil.validationReflection(request);
    }
}
