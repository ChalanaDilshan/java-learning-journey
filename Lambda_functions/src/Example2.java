public class Example2 {
    public static void main(String[] args){
        Running runner = (x) -> {
            System.out.println("Running speed: "+x);
        };

        runner.run(20);
    }
}

interface Running{
    void run(int x);
}
