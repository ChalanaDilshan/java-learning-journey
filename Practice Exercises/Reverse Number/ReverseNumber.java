import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to a reverse: ");
        int num = sc.nextInt();

       /*  while(num < 10){
            System.out.println("Enter 2 digit number to reverse");
            num  = sc.nextInt();
        } */

        int reverse = 0;

        while (num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("The reverse number is: "+reverse);
        sc.close();

    }
}