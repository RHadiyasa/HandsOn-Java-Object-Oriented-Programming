package rafi.hadiyasa.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("README].md"))){
            while (true){
                String line = reader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
