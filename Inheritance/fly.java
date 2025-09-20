interface flyable {
    void fly();
}

class Bird implements flyable {
    @Override
    public void fly(){
        System.out.println("The bird is flapping its wings and soaring");
    }
    public void chirp(){
        System.out.println("Chirp Chirp!");
    }
}

class Airplane implements flyable{
    @Override
    public void fly(){
        System.out.println("Airplane:Engines roaring,taking to skies.");
    }
}

public class fly {
    public static void main(String[] args) {
        Airplane air1 = new Airplane();
        air1.fly();

        Bird bird1 = new Bird();
        bird1.fly();
        bird1.chirp();
    }
}

