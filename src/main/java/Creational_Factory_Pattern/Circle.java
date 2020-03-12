package Creational_Factory_Pattern;

public class Circle implements Shape
{
    public String area(int size)
    {
        return "Area of circle is : "+String.valueOf(3.14*size*size);
    }
}
