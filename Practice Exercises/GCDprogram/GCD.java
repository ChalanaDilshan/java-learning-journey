package GCDprogram;
import java.util.Scanner;

public class GCD {

    public static int findGCD(int a,int b){
        while(b != 0 ){

            int temp = b;

            b = a % b;

            a = temp;

        }
        return a;
    }

    public static void option5(){
        Scanner sc = new Scanner(System.in);

        try {
                System.out.println("Enter the first number:");
                int num1 = sc.nextInt();

                System.out.println("Enter the second number:");
                int num2 = sc.nextInt();

                if(num1 <= 0 || num2 <= 0 ){
                    System.out.println("Please enter a valid positive number");
                    return;  //if above not happen program will end here
                }

                int gcd = findGCD(num1,num2);
                System.out.println("The GCD of "+num1+" and "+num2+" is "+gcd);

        } catch (Exception e) {
            System.out.println("Invalid input!Please enter integers only ");
        }
    }

    public static void main(String[] args){
        option5();
    }
}