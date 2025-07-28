package task04;
import java.util.*;
public class Task04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Mercedes");
        list.add("Toyota");
        list.add("Lamborghini");
        list.add("Bughatti");
        System.out.println("Which car you want to check ? ");
        String car = input.next();
        if(list.contains(car)){
            System.out.println("List contain this car");
        }
        else{
            System.out.println("List do not contain this car");
        }
    }
    
}
