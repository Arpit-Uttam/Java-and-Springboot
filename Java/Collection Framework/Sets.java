import java.util.*;

public class Sets {
    public static void main(String[] args) {
       //Set<Integer> nums=new HashSet<Integer>();   //it accept only unique value and return in random order
       Set<Integer> nums=new TreeSet<Integer>();     //it gives sorted values
       nums.add(7);
       nums.add(1);
       nums.add(6);
       nums.add(2);
       System.out.println(nums);
       Iterator<Integer> values= nums.iterator();    //use to traverse set
       while(values.hasNext()){
        System.out.println(values.next());
       }

    }
}
