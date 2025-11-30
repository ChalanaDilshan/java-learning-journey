
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class Example6 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product(3, "Car", 1500f));
        list.add(new Product(1,"Van",1750f));
        list.add(new Product(2,"Bike",1100f));

        System.out.println("==== Special Enhanced for loop ====");

        for(Product p : list){
            System.out.println("Item: "+p.name);
        }
        System.out.println();

        Stream<Product> filterData = list.stream().filter(Product -> Product.price > 1500f );
        System.out.println("=== Products over LKR 1500 ===");
        filterData.forEach((p) -> System.out.println(p.id+"."+p.name+ " Costs "+p.price));
        System.out.println();

        System.out.println("==== Before Sorting ====");
        list.forEach((p) -> System.out.println(p.id+"."+ p.name+" Costs LKR: "+p.price));

        Collections.sort(list, (p1,p2) -> {
                return p1.id - p2.id;
        });

        System.out.println("\n==== After sorting ====");
        list.forEach((p) -> System.out.println(p.id+"."+p.name+" Costs LKR: "+p.price));
        System.out.println();

    }
}


class Product {
   int id;
   String name;
   float price;

   public Product(int id,String name,float price){
    this.id = id;
    this.name = name;
    this.price = price;
   }
}

