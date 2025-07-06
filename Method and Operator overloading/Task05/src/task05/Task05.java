package task05;
import java.util.Scanner;
public class Task05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the real part of number one ");
        int realOne = input.nextInt();
        System.out.println("Enter the imaginary part of number one ");
        int imgOne = input.nextInt();
        System.out.println("Enter the real part of number two ");
        int realTwo = input.nextInt();
        System.out.println("Enter the imaginary part of number two ");
        int imgTwo = input.nextInt();
        ComplexNumber obj1 = new ComplexNumber();
        System.out.println("The sum of the two complext numbers is : "+obj1.addReal(realOne,realTwo)+","+obj1.addImg(imgOne, imgTwo)+"i");   
    }
    
}
