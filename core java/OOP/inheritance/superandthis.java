class A {

   public A(int n){
        System.err.println(n);
    }
}
class B extends A {
    public B(){
        int n = 10;
        super(n);
        System.err.println("in B constructor");
    }
}
public class superandthis {
    public static void main(String args[]){
        B obj = new B();
        
    }
    
}
