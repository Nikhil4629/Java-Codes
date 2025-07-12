import java.util.Scanner ;

class Person
{
    static Scanner sc = new Scanner (System.in) ;
    public void getFirstName()
    {
        System.out.println("Enter the first name: ");
        String firstName = sc.nextLine();
        System.out.println("First Name: " + firstName);
    }
    public void getLastName()
    {
        System.out.println("Enter the last name: ");
        String lastName = sc.nextLine();
        System.out.println("Last Name: " + lastName);
    }
}
public class Empoyee extends Person
{
    public void getEmployeeId()
    {
        System.out.println("Enter the Employee ID: ");
        int employeeId = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Employee ID: " + employeeId);
    }    

    @Override
    public void getLastName()
    {
        System.out.println("Enter the last name of the Employee: ");
        String lastName = sc.nextLine();
        System.out.println("Enter the job title of the Employee: ");
        String jobTitle = sc.nextLine();
        System.out.println("Job Title of Employee: " + jobTitle);
        System.out.println("Last Name of Employee: " + lastName);
    }

    public static void main(String[] args)
    {
        Person p = new Person();
        p.getFirstName();
        p.getLastName();
        
        Empoyee e = new Empoyee();
        e.getEmployeeId();
        e.getLastName();
    }
}
