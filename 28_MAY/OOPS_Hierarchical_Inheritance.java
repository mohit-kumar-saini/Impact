class Parent 
{
    void display()
    {
        System.out.println("Parent class");
    }
}
class Child extends Parent 
{
    void show() 
    {
        System.out.println("Child class");
    }
}
class GrandChild extends Parent 
{
    void print() 
    {
        System.out.println("GrandChild class");
    }
}
public class OOPS_Hierarchical_Inheritance 
{
    public static void main(String[] args) 
    {
        GrandChild grandChild = new GrandChild();
        grandChild.display(); 
        grandChild.print();    

        Child child = new Child();
        child.display(); 
        child.show();    
    }
} 