interface Mother{
    default void speak(){
        System.out.println("Hello from mother");
    }
}

interface Father{
    default void speak(){
        System.out.println("Hello from father");
    }
}


class Child implements Mother,Father{
    @Override
    public void speak(){
        Mother.super.speak();
        Father.super.speak();
    }
}

public class main{
    public static void main(String[] args) {
        Child child = new Child();

        child.speak();
    }
}
