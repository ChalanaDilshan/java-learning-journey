

public class Meth_overloading{
    public void meth(){
        System.out.println("Method 01");
    }

    public void meth(int x){
        System.out.println("Method 02");
    }

    public void meth(int x,int y){
        System.out.println("Method 3");
    }

    public static void main(String[] args){
    Meth_overloading meth1 = new Meth_overloading();
    //meth1.meth(); 
    meth1.meth(5,6);

    }
}