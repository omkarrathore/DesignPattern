package local.practice.DuckStartegyPattern;

public class Silence implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("No Sound, I am a mute duck");
    }
}
