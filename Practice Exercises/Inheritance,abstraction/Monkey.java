public class Monkey extends Mammal {
    Monkey(String name,int age,String furColor){
        super(name,age,furColor);
    }
    @Override
    public void makeSound(){
        System.out.println("Monkey is shouting...");
    }

    @Override
    public void eat(){
        System.out.println("Monkey is eating...");
    }
}
