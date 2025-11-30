import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Example6 {
    public static void main(String[] args) {

        // Create the List
        List<Product> list = new ArrayList<>();
        list.add(new Product(3, "Monitor", 200f)); // ID 3
        list.add(new Product(1, "Laptop", 1000f)); // ID 1
        list.add(new Product(2, "Mouse", 20f));    // ID 2

        System.out.println("--- Before Sorting ---");
        list.forEach(p -> System.out.println(p.id + " : " + p.name));

        // THE SORTING LAMBDA
        // Logic: Compare two products (p1 and p2). Subtract their IDs.
        Collections.sort(list, (p1, p2) -> {
            return p1.id - p2.id;
        });

        System.out.println("\n--- After Sorting ---");
        list.forEach(p -> System.out.println(p.id + " : " + p.name));
    }
}

// The Product Template
class Produuct {
    int id;
    String name;
    float price;

    public Produuct(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
