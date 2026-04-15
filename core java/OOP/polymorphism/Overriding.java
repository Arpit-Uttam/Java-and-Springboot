//method overriding is also called runtime polymorphism
class Parent {
    public void display() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("This is the child class method.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();  // Output: This is the parent class method.

        Child child = new Child();
        child.display();   // Output: This is the child class method.
    }
    
}
