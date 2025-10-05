import java.util.ArrayList;

public class Todolist {
    public static void main(String[] args){
        ArrayList<String> myarr = new ArrayList<>();

        System.out.println("Initial array: "+myarr);

        myarr.add("Walk the Dog");
        myarr.add("Buy groceries");
        myarr.add("Do home work!");

        System.out.println("Tasks in first: "+myarr);

        System.out.println("No of tasks are on the list: "+myarr.size());
        myarr.remove(2); // index method
                                // remove by content myarr.remove("Do home work!")

        System.out.println("Updated to do list: "+myarr);



        ArrayList<Integer> mynumbers = new ArrayList<>();
        System.out.println("Initial array: "+mynumbers);
        System.out.println();

        mynumbers.add(8);
        mynumbers.add(16);
        mynumbers.add(21);

        mynumbers.set(1,74); //updating value //can not change by content(only index)
        System.out.println("After Editing: "+mynumbers);
        System.out.println();

        mynumbers.remove(2);
        System.out.println("After removing: "+mynumbers);
        System.out.println();

        for (int i = 0; i < mynumbers.size();i++){
            System.out.println("Array content: "+mynumbers.get(i));
        }

        for (Integer numbers : mynumbers){          // safety and bug prevention
            System.out.println("Array content: "+numbers);  //didnt comeoutofbounds Exception
        }                                       //it automatically handles 

    }
}
