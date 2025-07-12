import java.util.Scanner ;
class Employee
{
    int id;
    double hourly_rate;
    double hours_worked;

    public Employee(int id , double hourly_rate , double hours_worked)
    {
        this.id = id ;
        this.hourly_rate = hourly_rate ;
        this.hours_worked = hours_worked ;
    }

    public double calculateGrossPay()
    {
        if(hours_worked <= 40)
        {
            return hours_worked * hourly_rate ;
        }
        else
        {
            double overtime = hours_worked - 40 ;
            return (hours_worked *hourly_rate) + (overtime * hourly_rate * 1.5) ;
        }
    }

    public double Calculatenetpay()
    {
        double grocess_pay = calculateGrossPay();
        double tax = grocess_pay * 0.03265 ; 
        return grocess_pay - tax ;
    }
}
public class Total_payroll
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of employees :");
        int size = s.nextInt() ;

        Employee Employees []= new Employee [size] ;

        for(int i = 0 ; i < size ; i++)
        {
            System.out.println("Enter the employeess ID :");
            int id = s.nextInt();

            System.out.println("Enter the hourly pay for the work :");
            double hourly_rate = s.nextDouble();

            System.out.println("Enter the hours worked by the employee :");
            double hours_worked = s.nextDouble();

            Employees [i] = new Employee(id, hourly_rate, hours_worked);
        }

        double Total_payroll = 0 ;
        System.out.println("__________________ALL EMPLOYEES NET PAY REPORT__________________");
        for(Employee emp : Employees)
        {
            double netpay = emp.Calculatenetpay();
            
            System.out.printf("ID : %d\nWorked Hours : %f \nNet Pay : %f\n",emp.id,emp.hours_worked,netpay);
            System.out.println();
            System.out.println("_______________________________________");
            Total_payroll += netpay ; 
        }

        double average_netpay = Total_payroll / size ;
        System.out.println();
        System.out.println("__________________Total PayRoll Summery__________________");

        System.out.println("The total payroll is :"+Total_payroll);
        System.out.println("The average net pay is :"+average_netpay);
        s.close();
    }
}