import java.util.Scanner;
public class HollowRhombus {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter N: ");
     int n = sc.nextInt();

     System.out.println("Enter a symbol: ");
     char character = sc.next().charAt(0);

     if (n <= 0){
        System.out.println("Enter a positive number...The number must be positive");
     }else{
        for (int i = 1; i <= n; i++){


            for(int j = 1; j <= n - i; j++){

                System.out.print(" ");
            }

            for (int j = 1;j <= n; j++){

                
                if(i == 1 || i == n || j == 1 || j == n){

                    System.out.print(character);
                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }

     }
    sc.close(); 
    }
}
