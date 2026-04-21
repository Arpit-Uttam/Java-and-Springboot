class ArpitException extends Exception {                     // This is a custom exception class that extends the built-in Exception class
    public ArpitException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new ArpitException("This is a custom exception!");    // This line throws an instance of the custom exception with a message
        } catch (ArpitException e) {                                        // This catch block catches the custom exception and prints its message
            System.out.println("Caught an ArpitException: " + e.getMessage());
        }
    }
}
