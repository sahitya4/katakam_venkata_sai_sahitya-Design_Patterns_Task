package Creational_Abstract_Pattern;

public class Cooler implements Airconditioner
{
    public Cooler_stab information()
    {
        System.out.println("I am Cooler.");
        return new Cooler_stab();
    }
}
