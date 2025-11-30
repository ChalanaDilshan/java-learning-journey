import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args){
        List<Products> list = new ArrayList<>();
        list.add(new Products(1,"Laptop",1000f));
        list.add(new Products(2,"Mouse",20f));
        list.add(new Products(3,"Monitor",200f));

//        Stream<Products> filterData = list.stream().filter(product -> product.price > 150f);
//        System.out.println("==== Products over LKR 150====");
//        filterData.forEach(p -> System.out.println(p.name +" : "+p.price));

        Stream<Products> filterData = list.stream().filter(product -> product.price > 150f ); //internal loop
        System.out.println("==== Products over LKR 150 ====");
        filterData.forEach(p -> System.out.println(p.name+" : "+p.price));
    }
}

class Products{
    int id;
    String name;
    float price;

    public Products(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
