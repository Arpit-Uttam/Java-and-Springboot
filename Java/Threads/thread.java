class A extends Thread{
    @Override
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Arpit");
        }
    }
}
class B extends Thread{
    @Override
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Uttam");
        }
    }
}
public class thread{
    public static void main(String []args){
        A t1 =new A();
        B t2=new B();
        t1.start();         //start the run method
        t2.start();

    }
}