package Interface;

public class MainMethod {
    public static void main(String[] args) {
        ChildAB cab = new ChildAB();
        cab.methodA();
        cab.methodB();
        cab.methodAB();

        a a1 = new ChildAB();
        a1.methodA();
    }
}
