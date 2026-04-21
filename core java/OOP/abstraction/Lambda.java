//lambda expressions are a feature in Java that allows you to write concise and functional code. They are often used to implement functional interfaces, which are interfaces with a single abstract method. Lambda expressions provide a way to create anonymous functions that can be passed around as first-class citizens in Java.
interface MyFunctionalInterface {
    void myMethod();                // This is the single abstract method that the lambda expression will implement
}
interface A{
    void add(int a,int b);
}
public class Lambda {
    public static void main(String[] args) {
        MyFunctionalInterface myLambda = () -> System.out.println("Hello, this is a lambda expression!");  // This is a lambda expression that implements the myMethod() of MyFunctionalInterface
        myLambda.myMethod();                    // This calls the myMethod() which will execute the lambda expression and print the message to the console
        A a=(x,y)->System.out.println("The sum is: "+(x+y));  // This is a lambda expression that implements the add() method of interface A, it takes two integers and prints their sum
        a.add(5, 10);                          // This calls the add() method which will execute the lambda expression and print the sum of 5 and 10 to the console
    
    }
}
