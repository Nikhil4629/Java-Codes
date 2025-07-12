import java.util.Scanner;
public class leapYear
{
    public static void main (String [] args)
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter the year: ");
        int year = S.nextInt();
        S.close();
        if(year % 4 == 0 || year %400 ==0 && year % 100 != 0)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" not a leap year");
        }
    }
}