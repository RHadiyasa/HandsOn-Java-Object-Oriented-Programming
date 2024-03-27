package rafi.hadiyasa.util;

import rafi.hadiyasa.annotation.NotBlank;
import rafi.hadiyasa.error.BlankException;
import rafi.hadiyasa.error.ValidationException;
import rafi.hadiyasa.records.LoginRequest;

import java.lang.reflect.Field;
import java.util.Objects;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, RuntimeException{
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()){
            throw new ValidationException("Username is Blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("Password is Null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidationException("Password is Blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null"); // ini tidak error karena extends ke RuntimeException
        } else if (loginRequest.username().isBlank()){
            throw new BlankException("Username is Blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("Password is Null");
        } else if (loginRequest.password().isBlank()){
            throw new BlankException("Password is Blank");
        }
    }

    public static void validationReflection(Object object) {

        Class aClass = object.getClass(); // ini adalah tipe data Class
        // Jika ingin mendapatkan fieldsnya maka gunakan Field yang ada di java.lang.reflect
        Field[] fields = aClass.getDeclaredFields(); // Mendapatkan semua fields public/private

        // Melakukan check satu per satu fieldsnya
        for (Field field : fields){
            // kita gatau fieldsnya private atau public
            // paksa fields untuk bisa diakses
            field.setAccessible(true);

            // Membaca fields apakah terdapat annotation blank atau tidak
            if (field.getAnnotation(NotBlank.class) != null){ // Ada annotationnya
                // kita ambil fieldsnya dengan get dan menggunakan parameter
                try {
                    String value = (String) field.get(object); // Kemungkinan terjadi illegal access exception
                    // bisa melakukan throws IllegalAccessException, atau bisa menggunakan try catch

                    if (value == null || value.isBlank()){ // cek apakah valuenya blank atau null
                        throw new BlankException("Fields " + field.getName() + " is blank");
                    }

                } catch (IllegalAccessException exception){
                    System.out.println("Cannot access fields " + field.getName());
                }
            }
        }
    }
}
