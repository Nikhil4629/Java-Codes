import java.util.Scanner ;
class Employee
{
    String name ;
    String address ;
    int salary ;
    String JobTitle ;
    static Scanner sc = new Scanner (System.in) ;
    public void Details()
    {
        System.out.println("Enter the Nmae of the Employee :");
        name = sc.nextLine();
        System.out.println("Enter the Address of the Employee :");
        address = sc.nextLine();
        System.out.println("Enter the Salary of the Employee :");
        salary = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the Job Title of the Employee :");
        JobTitle = sc.nextLine();

        System.out.println("Name : " + name + "\nAddress : " + address + "\nSalary : " + salary + "\nJob Title : " + JobTitle);
    }

    public void calculateBonus()
    {
        System.out.println("Enter the gross salary of the Employee :");
        int grossSalary = sc.nextInt();
        sc.nextLine(); 
        int bonus = grossSalary - salary;
        System.out.println("The bonus of the Employee is : " + bonus);
    }

    public void generatingPerformanceReport()
    {
   
        System.out.println("Name      : " + name);
        System.out.println("Address   : " + address);
        System.out.println("Salary    : " + salary);
        System.out.println("Job Title : " + JobTitle);
        System.out.println("Performance: Satisfactory");

    }    

    public void ManagingProjects()
    {
        System.out.println("Enter the number of given projects :");
        int numberOfProjects = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the number of projects completed :");
        int numberOfProjectsCompleted = sc.nextInt();
        sc.nextLine();
        if(numberOfProjectsCompleted >= numberOfProjects )
        {
            System.out.println("The Employee has completed more than half of the projects.");
        }
        else
        {
            System.out.println("The Employee has not completed more than half of the projects.");
        }
    }
}
class Manager extends Employee 
{
    public void Details()
    {
        System.out.println("Manager Details :");
        super.Details();
    }
    public void calculateBonus()
    {
        System.out.println("Calculating bonus for Manager...");
        super.calculateBonus();
    }
    public void generatingPerformanceReport()
    {
        System.out.println("Generating performance report for Manager...");
        super.generatingPerformanceReport();
    }
    public void ManagingProjects()
    {
        System.out.println("Managing projects for Manager...");
        super.ManagingProjects();
    }
   
}
class Developer extends Employee 
{
    public void Details()
    {
        System.out.println("Developer Details :");
        super.Details();
    }
    public void calculateBonus()
    {
        System.out.println("Calculating bonus for Developer...");
        super.calculateBonus();
    }
    public void generatingPerformanceReport()
    {
        System.out.println("Generating performance report for Developer...");
        super.generatingPerformanceReport();
    }
    public void ManagingProjects()
    {
        System.out.println("Managing projects for Developer...");
        super.ManagingProjects();
    }
}
public class Programmer extends Employee
{
    public void Details()
    {
        System.out.println("Programmer Details :");
        super.Details();
    }
    public void calculateBonus()
    {
        System.out.println("Calculating bonus for Programmer...");
        super.calculateBonus();
    }
    public void generatingPerformanceReport()
    {
        System.out.println("Generating performance report for Programmer...");
        super.generatingPerformanceReport();
    }
    public void ManagingProjects()
    {
        System.out.println("Managing projects for Programmer...");
        super.ManagingProjects();
    }
    public static void main(String[] args) 
    {
        Programmer programmer = new Programmer();
        programmer.Details();
        programmer.calculateBonus();
        programmer.generatingPerformanceReport();
        programmer.ManagingProjects();


        Manager manager = new Manager();
        manager.Details();
        manager.calculateBonus();
        manager.generatingPerformanceReport();
        manager.ManagingProjects();
        Developer developer = new Developer();
        developer.Details();
        developer.calculateBonus();
        developer.generatingPerformanceReport();
        developer.ManagingProjects();
        
    }    
}
