class Animal {
    String name;

    Animal(String name){
        this.name = name;
        System.out.println("1. Animal constructor was called");
    }
    
}

class Dog extends Animal{
    String breed;

    Dog(String name,String breed){
        super(name);

        this.breed = breed;
        System.out.println("2. Dog constructor was called.");
    }
}

public class Animals{
    public static void main(String[] args) {
        Dog mydog = new Dog("Buddy","Golden retriever");


        System.out.println("--- Object created ---");
        System.out.println("Name: " + mydog.name);
        System.out.println("Breed: " + mydog.breed);
    }
}
