package task03;
import java.util.*;
public class Task03 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Yellow");
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Black");
        System.out.println("The given list is : \n"+list);
        list.remove("Black");
        System.out.println("After removing black color :\n"+list);
    }
    
}
