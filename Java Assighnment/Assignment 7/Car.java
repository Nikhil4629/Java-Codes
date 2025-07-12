import java.util.Scanner ;
class Vehicle
{
    public void Drive()
    {
        System.out.println("Driving the vehicle.");
    }
}
public class Car extends Vehicle
{
    String name ;
    String colour ;
    public void Details()
    {
        System.out.println("Enter the name of the Car: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter the colour of the Car: ");
        colour = sc.nextLine();
        System.out.println("The name of the Car is: " + name);
        System.out.println("The colour of the Car is: " + colour);
        sc.close();
    }
    @Override
    public void Drive()
    {
        System.out.println("Repairing A car.");
    }
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle();
        v.Drive(); 
        Car c = new Car();
        c.Details();
        c.Drive();
    }
    
}
