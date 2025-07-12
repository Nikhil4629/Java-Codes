import java.util.Scanner ;
class Employee 
{
    public void Work()
    {
        System.out.println("Employee is working.");
    }
    
    public void getSalary()
    {
        System.out.println("Salary of the employee is  7.9 LPA.");
    }
}
public class HrManager extends Employee
{
    @Override
    public void Work()
    {
        System.out.println("HR Manager is managing the team.");
    }

    public void addEmployee()
    {
        System.out.println("Enter the name of the Employee: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter the position of the Employee: ");
        String position = sc.nextLine();
        System.out.println("The name of the Employee is: " + name);
        System.out.println("The position of the Employee is: " + position);
        sc.close();
    }

    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.Work(); 
        e.getSalary();
        
        HrManager hr = new HrManager();
        hr.addEmployee();
        hr.Work();
    
    }
}
    
