class Sports 
{
    void play() 
    {
        System.out.println("Playing a sport.");
    }
}

class Football extends Sports 
{
    void play() 
    {
        System.out.println("Playing Football: Kick the ball into the goal!");
    }
}

class Basketball extends Sports 
{
    void play() 
    {
        System.out.println("Playing Basketball: Shoot the ball into the hoop!");
    }
}

class Rugby extends Sports 
{
    void play() 
    {
        System.out.println("Playing Rugby: Run with the ball and tackle!");
    }
}

public class Override_SportsGame 
{
    public static void main(String[] args) 
    {
        Sports sports = new Sports();
        Sports sport1 = new Football();
        Sports sport2 = new Basketball();
        Sports sport3 = new Rugby();

        sports.play();
        sport1.play(); 
        sport2.play();
        sport3.play(); 
    }
}
