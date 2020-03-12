package Structural_Composite_Pattern;

public  class Cashier implements Employee
{
    private int id;
    private String name;
    private double salary;
    public Cashier(int id,String name,double salary)
    {
        this.id=id;
        this.name = name;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void print() {
        System.out.println("Id ="+getId());
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println();
    }
}

