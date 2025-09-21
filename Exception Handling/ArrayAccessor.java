import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class ArrayAccessor {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        Scanner sc =new Scanner(System.in);

        System.out.println("Array: "+Arrays.toString(numbers));
        System.out.println("Lets access an element and divide it");

        try{
            System.out.println("Enter an index to access:");
            int index = sc.nextInt();

            System.out.println("Enter a number to divide the element by:");
            int divisor = sc.nextInt();

            int result = numbers[index]/divisor;

            System.out.println("Result: "+numbers[index]+" /"+divisor+ "=" + result);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: the index you entered is out of bounds.");
        }catch(ArithmeticException e){
            System.out.println("Error:you cannot divide by zero.");
        }catch(InputMismatchException e){
            System.out.println("Error:Invalid input.please enter integers only");
        }finally{
            System.out.println("------------Program execution has finished-----------");
            sc.close(); //final block guaranteed to run.so sc.close(); is suitable for here to add 
        }
    }
}
