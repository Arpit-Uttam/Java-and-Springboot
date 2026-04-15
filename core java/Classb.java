public class Classb {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.change("blue", 5);

        System.out.println("Color: " + pen1.color);
        System.out.println("Nib: " + pen1.nip);
    }
}

class Pen {
    String color;
    int nip;

    void change(String newcolor, int newnip) {
        color = newcolor;
        nip = newnip;
    }
}