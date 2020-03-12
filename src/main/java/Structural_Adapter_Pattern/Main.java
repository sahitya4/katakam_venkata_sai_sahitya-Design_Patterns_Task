package Structural_Adapter_Pattern;

public class Main {
    public static void main(String args[]){
        CreditCard targetInterface=new Bankcustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
