import java.util.*;
public class foreachmethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(7, 8, 6, 2);
        nums.forEach(n -> System.out.println(n*2));
        nums.forEach(n -> System.out.println(n/2));
       
    }
}
