package Creational_Factory_Pattern;

public class Main
{
    public static  void main(String[]args)
    {
        Shape s = new Square();
        Shape c = new Circle();
        System.out.println(s.area(5));
        System.out.println(c.area(10));
    }
}
