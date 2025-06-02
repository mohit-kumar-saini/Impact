class Vehicle 
{
    void startEngine() 
    {
        System.out.println("Starting the engine of the vehicle...");
    }

    void stopEngine() 
    {
        System.out.println("Stopping the engine of the vehicle...");
    }
}

class Car extends Vehicle 
{
    void startEngine() 
    {
        System.out.println("Car engine started with a key or button.");
    }

    void stopEngine() 
    {
        System.out.println("Car engine stopped and parking brake applied.");
    }
}

class Motorcycle extends Vehicle 
{
    void startEngine() 
    {
        System.out.println("Motorcycle engine started with a kick or electric start.");
    }

    void stopEngine() 
    {
        System.out.println("Motorcycle engine stopped and side stand applied.");
    }
}

public class Override_VehicleTest 
{
    public static void main(String[] args) 
    {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        vehicle.startEngine();
        car.startEngine();
        car.stopEngine();

        vehicle.stopEngine();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
} 
