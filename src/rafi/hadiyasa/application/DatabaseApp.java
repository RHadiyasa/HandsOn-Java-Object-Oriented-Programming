package rafi.hadiyasa.application;

import rafi.hadiyasa.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        try{
            connectDatabase(null,"password");
            System.out.println("Success!");
        } catch (DatabaseError error){
//            System.out.println(error.getMessage());
            for (StackTraceElement element : error.getStackTrace()){
                System.out.println("File : " + element.getFileName());
                System.out.println("Method : " + element.getMethodName());
                System.out.println("Line Number : " + element.getLineNumber());
            }
        }
    }

    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Cannot connect to Database");
        }
    }
}
