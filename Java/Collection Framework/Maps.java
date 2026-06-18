import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> student=new HashMap<>();
        student.put("aryan", 78);
        student.put("arya", 78);
        student.put("kk", 78);
        student.put("arpit", 78);
        System.out.println(student);                        //print in random order
        System.out.println(student.get("kk"));     
        System.out.println(student.keySet());     


    }
    
}
