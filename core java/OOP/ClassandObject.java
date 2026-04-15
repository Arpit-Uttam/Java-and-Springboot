package OOP;

public class ClassandObject {
   pen pen1 = new pen();
   pen1.change("blue", 5); 
   System
}
class pen{
    String color;
    int nip;
    void change(String newcolor, int newnip){
        color = newcolor;
        nip = newnip;
    }
}