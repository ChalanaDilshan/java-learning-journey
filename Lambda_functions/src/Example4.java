import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args){
        List<Product> list = new ArrayList<>();

        list.add(new Product(1,"Laptop",1000f));
        list.add(new Product(2,"Mouse",20f));
        list.add(new Product(3,"keyboard",50f));

        list.forEach((p) -> System.out.println(p.name + " Costs LKR: "+p.price));
    }
}

class Product{
    int id;
    String name;
    float price;

    public Product(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}