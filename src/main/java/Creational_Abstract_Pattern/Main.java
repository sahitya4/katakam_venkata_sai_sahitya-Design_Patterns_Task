package Creational_Abstract_Pattern;

public class Main
{
    public static void main(String[]args)
    {
        Airconditioner cool = new Cooler();
        //Airconditioner split = new Split_Ac();
        System.out.println(cool.information().instruction());
        //System.out.println(split.information().instruction());
    }
}
