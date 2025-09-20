import java.util.Scanner;
public class Student {
    private String name;
    private int age;
    private double speed;


    public void setName(){
        name = "Chalana";
    }

    public String getName(){
        return this.name;
    }

    public void setSpeed(){
        speed = 5.8574;
    }

    public double getSpeed(){
        return this.speed;
    }


    
    public static void main (String[] args){
        Student st1 = new Student();
       // st1.setName();
        st1.setSpeed();
        System.out.println("Speed is : "+st1.getSpeed());

        double b  = st1.getSpeed();
        String bformatted = String.format("%.2f",b);

        System.out.println("Speed is : "+bformatted);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = sc.nextLine();
        System.out.println("Enter your age: ");
        int myage = sc.nextInt();
        
        
        System.out.println("My name is: "+username);
        System.out.println("My age is: "+myage);
        System.out.println("Speed is : "+String.format("%.2f",st1.getSpeed())); //this will round off without creating variable

        //System.out.println("My name is : "+st1.getName());

        sc.close();
    }
}

 
