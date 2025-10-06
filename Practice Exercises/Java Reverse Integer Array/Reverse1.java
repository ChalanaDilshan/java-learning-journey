import java.util.InputMismatchException;
import java.util.Scanner;
class Reverse {

    public void handleReversal(){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 values for integer array");

        for (int i = 0; i < numbers.length; i++){
            while(true){
                System.out.println("Enter value: ");
            try {
                numbers[i] = sc.nextInt();  //if integer input is recieved break keyword executed
                break; //break the while loop if user enters correct number
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.please enter and integer value");
                sc.next(); //clears input buffer.if user inputs string or any it removes from this line
            }               //if it is not scanner stores not int data and run for while loop.in the while loop now scanner sees not int input.it repeatedly execute catch block endlessly.
        }
    }

    System.out.println("----Reversed array----");
    for (int i = numbers.length - 1;i >= 0;i--){   //java is zero indexed if it find [5] it doesnt exist.it exist 4.
        System.out.print(numbers[i] + " ");
    }
    System.out.println();

    sc.close();
    }

}
public class Reverse1{
    public static void main(String[] args){
        Reverse array = new Reverse();
        array.handleReversal();
    }
}



