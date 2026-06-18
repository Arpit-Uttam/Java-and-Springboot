import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<Integer>();
        arr.add(2);
        arr.add(8);
        arr.add(2);
        arr.add(1);
        arr.add(7);
        System.out.println(arr.get(2));
        System.out.println(arr.indexOf(7));
        arr.remove(2);
        System.out.println(arr);
    }
    
}
