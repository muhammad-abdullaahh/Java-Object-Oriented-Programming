package task02;

public class Task02 {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(30000);
        System.out.println("Before withdraw...");
        b1.displayInfo();
        b1.depositAmount(10000);
        System.out.println("After depositing 10000");
        b1.displayInfo();
        b1.withdrawAmount(20000);
        System.out.println("After withdrawing 20000");
        b1.displayInfo();
    }
    
}
