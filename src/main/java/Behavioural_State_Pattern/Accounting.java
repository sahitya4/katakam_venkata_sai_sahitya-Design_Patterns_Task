package Behavioural_State_Pattern;

public class Accounting implements Bank
{
    public void open() {
        System.out.println("open database for accounting");
    }
    public void close() {
        System.out.println("close the database");
    }
}
