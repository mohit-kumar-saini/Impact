class Grandparent 
{
    void display() 
    {
        System.out.println("Grandparent class");
    }
}
class Parent extends Grandparent 
{
    void show() 
    {
        System.out.println("Parent class");
    }
}
class Child extends Parent 
{
    void print() 
    {
        System.out.println("Child class");
    }
}
public class OOPS_Multilevel_Inheritance 
{
    public static void main(String[] args) 
    { 
        Child child = new Child();
        child.display(); 
        child.show();    
        child.print();   
    }
}
