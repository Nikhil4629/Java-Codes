import java.util.Scanner;

class Vehicle
{
    String make ;
    String model ;
    int year ;
    double startOdometer ;
    double endOdometer ;
    double fuelConsumed ;
    static Scanner sc = new Scanner(System.in);

    
   public void Input()
   {
     System.out.println("Enter the Start odometer reading :");
     startOdometer = sc.nextDouble();
     System.out.println("Enter the End odometer reading :");
     endOdometer = sc.nextDouble();
     System.out.println("Enter the fuel consumed in Liter :");
     fuelConsumed = sc.nextDouble();
   }
   public void ShowDetails()
   {
       System.out.println("Make : " + make);
       System.out.println("Model : " + model);
       System.out.println("Year : " + year);

   }
    public void CalculeteEfficency()
    {
        Input();
        double distance = endOdometer - startOdometer;
        double fuelEfficiency = distance / fuelConsumed;
        System.out.println("The fuel efficiency of the Vehicle is : " + fuelEfficiency + " km/l");
        
    }
}
class Truck extends Vehicle 
{
    public Truck(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void ShowDetails()
    {
        System.out.println("Truck Details :");
        super.ShowDetails();
    }

    public void CalculeteEfficency()
    {
        Input();
        double distance = endOdometer - startOdometer;
        double fuelEfficiency = distance / fuelConsumed;
        System.out.println("The fuel efficiency of the Truck is : " + fuelEfficiency + " km/l");
        
    }
}
class Car extends Vehicle
{
    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void ShowDetails()
    {
        System.out.println("Car Details :");
        super.ShowDetails();
    }
    public void CalculeteEfficency()
    {
        Input();
        double distance = endOdometer - startOdometer;
        double fuelEfficiency = distance / fuelConsumed;
        System.out.println("The fuel efficiency of the Car is : " + fuelEfficiency + " km/l");
        
    }
}
class Bike extends Vehicle
{
    public Bike(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void ShowDetails()
    {
        System.out.println("Bike Details :");
        super.ShowDetails();
    }
    public void CalculeteEfficency()
    {
        Input();
        double distance = endOdometer - startOdometer;
        double fuelEfficiency = distance / fuelConsumed;
        System.out.println("The fuel efficiency of the Bike is : " + fuelEfficiency + " km/l");
        
    }
}
public class CreateAVehicleHirerchy
{
    public static void main(String[] args) 
    {
       
        System.out.println("Enter the type of vehicle (Truck/Car/Bike): ");
        String vehicleType = Vehicle.sc.nextLine();
        Vehicle vehicle ;

        if (vehicleType.equalsIgnoreCase("Truck")) {
            vehicle = new Truck("Ford", "F-150", 2020);
        } else if (vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car("Toyota", "Camry", 2021);
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            vehicle = new Bike("Yamaha", "YZF-R3", 2019);
        } else {
            System.out.println("Invalid vehicle type.");
            return;
        }

        vehicle.ShowDetails();
        vehicle.CalculeteEfficency();
       
    }    
}    

