import java.util.Scanner;
public class VowelFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        if (name.isEmpty()){
            System.out.println("Name cannot be empty");
        }else{
            System.out.println("Vowels available in your name");
            for (int i = 0; i < name.length(); i++){
                char ch = name.charAt(i);
                if ("AEIOUaeiou".indexOf(ch) != -1){
                    System.out.print(ch+",");
                }
            }
        }
        sc.close();
    }
}

