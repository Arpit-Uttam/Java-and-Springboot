public class Main {   // main method must be inside a class
    public static void main(String args[]){
        int a = 8;
        int b = 2;

        VeryAdv obj = new VeryAdv();
        int r = obj.add(a, b);
    
        System.out.println("Addition: " + r);

        r = obj.sub(a, b);
        System.out.println("Subtraction: " + r);
                                                                //multilevel inheritance
        r = obj.mul(a, b);
        System.out.println("Multiplication: " + r);

        r = obj.div(a, b);
        System.out.println("Division: " + r);

        double dr = obj.power(a, b);
        System.out.println("Power: " + dr);
    }
}