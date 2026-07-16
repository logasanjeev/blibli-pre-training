class InvalidDigitCountException extends Exception {
    public InvalidDigitCountException(String message) {
        super(message);
    }
}

public class CustomExceptionTask {
    public static void validateSingleDigit(int number) throws InvalidDigitCountException {
        if(number / 10 != 0) throw new InvalidDigitCountException("Rejected: The number " + number + " has more than one digit.");
        System.out.println("Success: " + number + " is a valid single digit number.");
    }

    public static void main(String[] args) {
        try {
            validateSingleDigit(8);
            validateSingleDigit(-6);
            validateSingleDigit(42);
        }
        catch (InvalidDigitCountException e) {
            System.out.println(e.getMessage());
        }
    }
}
