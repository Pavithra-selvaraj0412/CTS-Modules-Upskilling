class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Main {
    public static void main(String[] args) {
        int age = 15;

        try {
            if(age < 18)
                throw new InvalidAgeException("Age must be 18 or above");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}