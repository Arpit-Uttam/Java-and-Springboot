class Student {
    private String name;
    private int rollNo;
    private String course;
    public Student(){
        System.out.println("You are in Student Constructor");
    }
}
public class Encapsulationex{
    public static void main(String[] args) {
        Student s1 = new Student();
       // s1.name="john";             //here we are directly accessing the private variable which is not possible because of encapsulation
    }
}