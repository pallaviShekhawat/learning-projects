package exception;

class InvalidAgeException extends Exception {
    public InvalidAgeException (String message){
        super(message);
    }
}
public class CustomException {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must me be 18 or above 18");
        } else {
            System.out.println("You are eligible to vote");
        }

    }

    public static void main(String[] args) {
        try {
            checkAge(15);
            checkAge(20);
        }
    catch(InvalidAgeException e)
    {
        System.out.println("Exception Caught: " + e.getMessage());
    }
    System.out.println("Program continue normally");
}
}
