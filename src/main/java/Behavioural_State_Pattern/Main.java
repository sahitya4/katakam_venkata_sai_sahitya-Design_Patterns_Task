package Behavioural_State_Pattern;
import java.util.*;
public class Main {
    Controller controller;

    Main(String con)
    {
        controller = new Controller();
        if (con.equalsIgnoreCase("sales"))
            controller.setSalesConnection();
        if (con.equalsIgnoreCase("accounting"))
            controller.setAccountingConnection();
        controller.open();
        controller.close();
    }


    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Accounting/Sales :");
        String ch = s.next();
        new Main(ch);
    }
}
