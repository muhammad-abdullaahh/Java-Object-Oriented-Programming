package task02;
import java.util.*;
public class Task02 {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(34);
        list.add(23);
        list.add(99);
        list.add(2);
        list.add(15);
        list.add(87);
        System.out.println("The list is :\n"+list);
        Collections.sort(list);
        int max = Collections.max(list);
        System.out.println("The largest integer is "+max);
    }
    
}
