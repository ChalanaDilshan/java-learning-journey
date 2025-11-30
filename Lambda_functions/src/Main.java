//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            myinterface b = ()->{
                System.out.println("Moving...!");
        };

        b.run();
    }
}

interface myinterface{
    void run();
}