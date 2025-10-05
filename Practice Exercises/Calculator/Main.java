package Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

class calculator {
    protected float num1;    
    protected float num2;

    calculator(float num1,float num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public float addNumbers(){
        return num1+num2;
    }

    public float substractNumbers(){
        return num1-num2;
    }

    public float divideNumbers(){
        return num1 / num2;
    }

    public float multiplyNumbers(){
        return num1 * num2;
    }
}

public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        try{
            
            System.out.print("Enter number 1: ");
            int num1  = sc.nextInt();

            System.out.print("Enter number 2: ");
            int num2 = sc.nextInt();

            System.out.print("Enter operator (+,-,/,*)");
            char symbol = sc.next().charAt(0);

            calculator Cal1 = new calculator(num1,num2);

            switch(symbol){
                case '+':
                    System.out.println("Addition is: "+String.format("%.2f",+Cal1.addNumbers()));
                    break;
                case '-':
                    System.out.println("Substraction is: "+String.format("%.2f",Cal1.substractNumbers()));
                    break;
                case '/':
                    System.out.println("Division is: "+String.format("%.2f",Cal1.divideNumbers()));
                    break;
                case '*':
                    System.out.println("Multiplication is: "+String.format("%.2f",Cal1.multiplyNumbers()));
                    break;
                default:
                    System.out.println("Input valid operator");
            }

        }catch(InputMismatchException e){
            System.out.println("Enter Valid number");
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally{
            sc.close();
        }
    }
}
