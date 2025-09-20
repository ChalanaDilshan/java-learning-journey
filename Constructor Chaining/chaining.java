public class chaining {
    String model;
    String color;

    chaining(String model){
        this(model,"Black");
        System.out.println("Constructor 1 is running...");
    }

    chaining(String model,String color){
        this.model = model;
        this.color = color;
        System.out.println("Constructor 2 is running...");
    }

    public static void main(String[] args) {
        chaining mychain1 = new chaining("Mustang");
    }
}
