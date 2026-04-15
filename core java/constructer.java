public class constructer {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
    }
}
class Pen {
    String color;
    int nip;

    Pen(){
        System.out.println("Constructor called");   //we can give values here as well
    }
}
