interface A 
{
    void methodA();
}
interface B extends A 
{
    void methodB();
}
interface C 
{
    void methodC();
}
class D implements B, C 
{
    public void methodA() 
    {
        System.out.println("Method A from Interface A");
    }
    public void methodB() 
    {
        System.out.println("Method B from Interface B");
    }
    public void methodC() 
    {
        System.out.println("Method C from Interface C");
    }
    void methodD()
    {
        System.out.println("Method D from Class D");
    }
}
public class OOPS_Hybrid_Inheritance 
{
    public static void main(String[] args) 
    {
        D obj = new D();
        obj.methodA();  
        obj.methodB();  
        obj.methodC();  
        obj.methodD();  
    }
}
