abstract class A{                 //abstract class
    abstract public void show();    //abstract method
}
class B extends A{                //concrete class
    @Override
    public void show(){
        System.out.println("In class B");
    }
}
//abstract class may have abstract methods or not but abstract method must be in abstract class and concrete class must override the abstract method of abstract class otherwise it will give compile time error
public class Abstractkeyword {
    public static void main(String[] args) {
        A a=new B();
        a.show();   //Output: In class B
    }
}
