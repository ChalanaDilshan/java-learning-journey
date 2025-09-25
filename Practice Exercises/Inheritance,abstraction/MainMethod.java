public class MainMethod {
    public static void main(String[] args) {
        Lion lion = new Lion("Lion",12,"Brown");
        lion.makeSound();
        lion.eat();
        System.out.println("Lion's Age: "+lion.getAge());

        System.out.println("-----------------------");

        Monkey monkey1 = new Monkey("Srilankan Monkey",15,"Black");
        monkey1.makeSound();
        monkey1.eat();
        System.out.println("Monkey's Age: "+monkey1.getAge());

        System.out.println("-----------------------");
    }
}
