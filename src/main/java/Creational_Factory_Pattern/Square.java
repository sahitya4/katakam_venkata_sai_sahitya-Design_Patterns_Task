package Creational_Factory_Pattern;

public class Square implements Shape
{
    @Override
    public String area(int size)
    {
        return "Area of square is : "+String.valueOf(size*size);
    }
}
