package Behavioural_State_Pattern;

public class Sales implements Bank
{
    public void open()
    {
        System.out.println("open database for sales");
    }
    public void close()
    {
        System.out.println("close the database");
    }
}
