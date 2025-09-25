public abstract class Reptile extends Animal {
    private boolean hasScales = false;

    Reptile(String name,int age){
        super(name,age);
    }

    public boolean getHasScales(){
        return hasScales;
    }
}
