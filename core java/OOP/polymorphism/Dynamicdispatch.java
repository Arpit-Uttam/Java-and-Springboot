//it only works with method overriding not method overloading with inheritance
class A{
    public void show(){
        System.out.println("In class A");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("In class B");
    }
}
class C extends A{
    @Override
    public void show(){
        System.out.println("In class C");
    }
}
public class Dynamicdispatch {
    public static void main(String[] args) {
        A a=new A();
        a.show();   //Output: In class A
        a=new B();
        a.show(); //Output: In class B
        a=new C();  
        a.show();   //Output: In class C
    }
}
