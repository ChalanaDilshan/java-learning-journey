public class Example1 {
    public static void main(String[] args){
        Playable playable = () ->{
            System.out.println("Play");
        };

        playable.play();
    }
}

interface Playable{
    void play();
}
