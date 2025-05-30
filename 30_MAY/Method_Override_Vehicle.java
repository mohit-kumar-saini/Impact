class Vehicle 
{
    public void speed() 
    {
        System.out.println("The vehicle increases speed.");
    }
}
class Car extends Vehicle 
{
    public void speed() 
    {
        System.out.println("The car increases speed quickly using an accelerator.");
    }
}
class Cycle extends Vehicle 
{
    public void speed() {
        System.out.println("The cycle increases speed slowly by pedaling.");
    }
}

public class Method_Override_Vehicle 
{
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myCycle = new Cycle();

        myVehicle.speed();
        myCar.speed();
        myCycle.speed();
    }
}
