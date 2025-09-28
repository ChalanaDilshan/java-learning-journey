import java.util.Scanner;
public class ReverseStringProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String OriginalString = sc.nextLine();

        String ReversedString = "";

        if(OriginalString == null || OriginalString.isEmpty()){
            System.out.println("Error:The input cannot be empty");
        }else{
            for(int i = OriginalString.length() - 1; i >= 0; i--){
                char character = OriginalString.charAt(i);
                ReversedString = ReversedString + character;
            }
            System.out.println("The reverse of the input string is: "+ReversedString);
        }
        sc.close();
    }
}