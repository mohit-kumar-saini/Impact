class Animal
{
    public void move()
    {
        System.out.println("Animal is moving");
    }
}

class Cheetah extends Animal
{
    public void move()
    {
        System.out.println("Cheetah is running fast");
    }
}
public class Override_Animal
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.move(); 
        Cheetah cheetah = new Cheetah();
        cheetah.move();  
    }
}