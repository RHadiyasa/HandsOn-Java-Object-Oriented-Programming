package rafi.hadiyasa.error;

public class ValidationException extends Throwable {

    String message;

    /*public ValidationException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() { // Sebenarnya sudah ada di parentnya.
        return message;
    }*/

    public ValidationException(String message){
        super(message);
    }
}
