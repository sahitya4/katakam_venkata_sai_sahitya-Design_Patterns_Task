package Behavioural_Template_Pattern;

public abstract class Game {

    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play()
    {
        initialize();
        start();
        end();
    }
}