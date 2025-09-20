abstract class myblueprint {
    public abstract void startEngine();  //abstract method,sub class must complete
    public abstract void driving();

    public void honkHorn(){  //this concrete method ,ready made
        System.out.println("Beep beep!");
    }

    public static void main(String[] args) {
        System.out.println("Program is running from the abstract class!");
        // myblueprint mycar = new myblueprint();
        Car myclass = new Car();
        myclass.honkHorn();
        myclass.startEngine();
    }
}

class Car extends myblueprint{
    @Override
    public void startEngine(){
        System.out.println("Engine started.Its electric!");
    } 
    
    @Override
    public void driving(){
        System.out.println("Car is driving");
    }
}
