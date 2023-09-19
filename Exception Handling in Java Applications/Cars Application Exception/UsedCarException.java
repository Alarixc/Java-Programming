package Cars;

public class UsedCarException extends Exception {
    public UsedCarException(String s) {
        super("Given information is incorrect.");
    }
}

