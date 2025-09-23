public class MainMethod {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sleep();
        d1.eat();

        Animal a = new Dog();
        a.eat();
        a.sleep();
    }
}
