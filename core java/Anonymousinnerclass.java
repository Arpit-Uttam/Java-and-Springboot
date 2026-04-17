class Student{
    public void Course(){
        System.out.println("In course method of student class");
    }
    
    
}
public class Anonymousinnerclass {
    public static void main(String[] args) {
        Student s= new Student(){                    //by this can override the method course without creating any class and this is called anonymous inner class
            @Override
            public void Course(){
                System.out.println("In course method of anonymous inner class");
            }
        };
        s.Course();
    }
}
