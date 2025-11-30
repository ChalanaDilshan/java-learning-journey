public class Example3 {
    public static void main(String[] args){
        Addable calculator = (a,b) -> (a+b);
        System.out.println(calculator.add(10,20));
    }
}

interface Addable{
    int add(int a,int b);
}
