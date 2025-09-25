public class Lion extends Mammal {
    Lion(String name,int age,String furColor ){
        super(name,age,furColor);
    }
    @Override
    public void makeSound(){
        System.out.println("Lion Roars");
    }
    
    @Override
    public void eat(){
        System.out.println("Snake Swallows its pray");
    }
}
