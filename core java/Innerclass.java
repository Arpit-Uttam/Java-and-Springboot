class A{
    public void show(){
        System.out.println("In class A");
    }
    class B{    //inner class
        public void display(){
            System.out.println("In class B");
        }
    }
}
public class Innerclass {
    public static void main(String[] args) {
        A a = new A();
        //a.show();
        A.B b = a.new B();   //creating object of inner class by this reference of outer class
        b.display();
    }
}
