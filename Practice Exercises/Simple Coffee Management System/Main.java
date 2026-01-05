import java.util.Scanner;

public class Main{
    
    public static double calculateBill(double price,int quantity){
        return price * quantity;
    }
    public static void main(String[] args){
        
        System.out.println("Welcome to coffee management system");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Customer's name: ");
        String name = sc.nextLine();
        
        System.out.print("How many types of coffess available: ");
        int types = sc.nextInt();
        
        sc.nextLine();
        
        String[] coffeenames = new String[types];
        double[] coffeePrices = new double[types];
        
        for(int i = 0;i < types; i++){
            System.out.println("Enter details of Coffee Type: "+(i+1)+ " : ");
            System.out.print("Name: ");
            coffeenames[i] = sc.nextLine();
            
            System.out.print("Price: ");
            coffeePrices[i] = sc.nextDouble();
            
            sc.nextLine();
        }
        
        System.out.println("-----Menu-----");
        
        for(int i = 0; i < types; i++){
            System.out.println((i+1) +". "+coffeenames[i]+" | "+coffeePrices[i]);
        }
        System.out.println("---------------");
        
        
        System.out.print("Enter number of the coffee you want: ");
        int choice = sc.nextInt();
        
        int index = choice - 1;
        
        System.out.print("How many cups do you want: ");
        int cups = sc.nextInt();
        
        System.out.println("Starting to brew your coffee....");
        int served = 0;
        
        
        while (served < cups){
            served++;
            System.out.println("Serving cup....");
        }
        
        double total = calculateBill(coffeePrices[index],cups);
        System.out.println("Your total bill is : "+total);
        
        System.out.println("Thank you!");
        
        sc.close();
        
    }
}