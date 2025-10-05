public class typecast {
    public static void main(String[] args) {
        //int myInt = 10;
        //double myDouble = myInt;

        //System.out.println("Original integer value is: "+myInt);
       // System.out.println("The converted  double value: "+myDouble);


       double myDouble = 9.78;
       double saantha = 8.563;

       int myInt = (int) myDouble;
       int myint2 = (int) saantha;

       int numf = (int) myDouble;
       System.out.println("The original double:" +myDouble);
       System.out.println("The narrowed int: "+myInt);
       System.out.println(myint2);
    }
}
