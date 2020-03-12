package Structural_Composite_Pattern;

public class Main
{
    public static void main(String args[]){
        Employee emp1=new Cashier(101,"Sohan Kumar", 20000.0);
        Employee emp2=new Cashier(102,"Mohan Kumar", 25000.0);
        Employee emp3=new Accountant(103,"Seema Mahiwal", 30000.0);

        emp1.print();
        emp2.print();
        emp3.print();
    }
}
