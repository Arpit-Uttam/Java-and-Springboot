class Trycatch{
    public static void main(String[] args) {
        try {
            int a = 10 / 0;                        // This will throw an ArithmeticException
            System.out.println("Result: " + a);
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}