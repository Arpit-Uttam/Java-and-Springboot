class Calc{
    public int add(int a, int b){
        return a + b;
    }

}
class AdvCalc extends Calc{
        public int add(int a, int b){       //here we are overriding the add method of Calc class
        return a + b+10;
    }
}
public class methodoveriding {
    public static void main(String[] args) {
      AdvCalc obj = new AdvCalc();
      int r = obj.add(5, 10);   
        System.out.println(r);  
    }
}
