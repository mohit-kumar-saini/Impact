class Animal 
{
    public void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal 
{

    public void sound() 
    {
        System.out.println("Cat says: Meow");
    }
}

class Bird extends Animal 
{
    public void sound() 
    {
        System.out.println("Bird says: Tweet");
    }
}

public class Override_Animal 
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myBird = new Bird();
        
        myAnimal.sound();
        myCat.sound();   
        myBird.sound();  
    }
}
