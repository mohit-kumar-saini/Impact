class Employee 
{
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary) 
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public double calculateSalary() 
    {
        return salary;
    }
}
class Manager extends Employee
{
    double bonus;

    public Manager(String name, int id, double salary, double bonus) 
    {
        super(name, id, salary);
        this.bonus = bonus;
    }
    public double calculateSalary() 
    {
        return salary + bonus;
    }
}
class Developer extends Employee 
{
    double overtime;

    public Developer(String name, int id, double salary, double overtime) 
    {
        super(name, id, salary);
        this.overtime = overtime;
    }
    public double calculateSalary() 
    {
        return salary + overtime;
    }
}
public class Salary 
{
    public static void main(String[] args) 
    {
        Manager mgr = new Manager("Alice", 101, 50000, 10000);
        Developer dev = new Developer("Bob", 102, 40000, 5000);

        System.out.println("Manager Salary: " + mgr.calculateSalary());
        System.out.println("Developer Salary: " + dev.calculateSalary());
    }
}
