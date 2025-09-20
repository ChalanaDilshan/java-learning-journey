class Animal {
    public void move(){
        System.out.println("Animal is moving");
    } 
}

class Dog extends Animal{
    // This method overrides the parents move method
    @Override
    public void move(){
        super.move();
        System.out.println("Dog is running on four legs");
    }
}

public class Living{
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.move();
    }
}