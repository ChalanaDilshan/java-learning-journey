package ATM;

import java.util.Scanner;
class Account {
    private int accountNumber;
    private String accountHolder; 
    private int pin;
    private double balance;

    Account(int accountNumber,String accountHolder,int pin,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.pin = pin;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public boolean validatePin(int enteredPin){
        return this.pin == enteredPin;
    }

    public void deposit (double amount){
        if (amount > 0){
            balance = balance+ amount;
            System.out.println("Successfully deposited: "+String.format("%.2f",amount));
        }else{
            System.out.println("Deposit amount must be positive");
        }
    } 

    public void withdraw(double withdrawamount){
        if (withdrawamount <= 0){
            System.out.println("Withdrawal must be positive");
        }else if(withdrawamount > balance){
            System.out.println("Insufficient funds");
        }else{
            balance = balance - withdrawamount;
            System.out.println("Successfully withdraw Rs: "+String.format("%.2f",withdrawamount));
        }
    } 

    public void Display(){
        System.out.println("------Account Details-----");
        System.out.println("Account number: "+accountNumber);
        System.out.println("Account name: "+accountHolder);
        System.out.println("Balance: "+balance);
        System.out.println("--------------------------");
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account1 = new Account(2052001,"Chalana Dilshan",1234,7500);
       
        int choice = 0;
        while(choice != 4){

            System.out.println("---Welcome to ATM---");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.println("---------------------");

            System.out.print("Enter Your choice: ");
            choice = sc.nextInt();

            switch(choice){
                 case 1:
                    account1.Display();
                    break;
                 case 2:
                    System.out.println("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    account1.deposit(amount);
                    break;
                 case 3:
                     System.out.println("Enter amount to withdraw: ");
                    double withdrawamount =  sc.nextDouble();
                    account1.withdraw(withdrawamount);
                    break;
                 case 4:
                    System.out.println("Thank for using ATM good bye!");
                    break;
                 default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
