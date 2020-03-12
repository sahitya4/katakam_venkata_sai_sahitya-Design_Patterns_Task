package Behavioural_Template_Pattern;
import java.util.*;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter chess/carroms:");
        String option = s.next();
        if(option.equals("chess"))
        {
            Game game = new Chess();
            game.play();
        }
        else if(option.equals("carroms"))
        {
            Game game = new Carroms();
            game.play();
        }
        else
        {
            System.out.println("Please enter valid input...");
        }
    }
}