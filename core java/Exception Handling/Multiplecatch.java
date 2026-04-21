public class Multiplecatch {
    public static void main(String[] args) {
       
       try {
            int a = 10 / 0;                        // This will throw an ArithmeticException
            System.out.println("Result: " + a);
        } 
       
        catch (ArithmeticException e) {                    //this will catch the ArithmeticException thrown by the division by zero
            System.out.println("Caught an exception: " + e.getMessage());          
        } 
        catch(ArrayIndexOutOfBoundsException e){                //this will catch the ArrayIndexOutOfBoundsException thrown by trying to access an index that is out of bounds
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (Exception e) {                                  //this will catch any other exceptions that are not caught by the previous catch blocks
            System.out.println("Caught a general exception: " + e.getMessage());

        }
    }
}
