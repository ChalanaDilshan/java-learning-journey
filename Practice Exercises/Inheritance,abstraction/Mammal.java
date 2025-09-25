public abstract class Mammal extends Animal {
    private String furColor;

    Mammal(String name,int age,String furColor){
        super(name,age);
        this.furColor = furColor;
    }

    public String getFurColor(){
        return furColor;
    }
}
