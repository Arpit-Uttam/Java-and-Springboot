//method overloading is also called compile time polymorphism
class Add{
    public int add(int a, int b){
        return a+b;
    }
     public int add(int a, int b , int c){
        return a+b+c;
    }
    public double add(double a, double b){       //method overloading same method name but different parameters and datatype
        return a+b;
    }
    
}
public class Overloading {
    public static void main(String[] args) {
        Add a=new Add();
        System.out.println(a.add(2,5));
         System.out.println(a.add(2,5,7));
          System.out.println(a.add(6.7,5.6));
    }
    
}
