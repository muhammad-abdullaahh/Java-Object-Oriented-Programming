package task02;

public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }
    public void depositAmount(double amount){
        balance+=amount;
    }
    public void withdrawAmount(double amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("The entered amount is gretaer than bthe current balance");
        }
    }
    public void displayInfo(){
        System.out.println("Your current bank balance is:" +balance);
    }
}
