import java.util.Scanner;

public class Devisible_by_9
{
    public static void DivisibleByNine(int n )
    {
        int sum = 0,temp = n ;

        while (n != 0)
        {
            int rem = n % 10 ;
            System.out.print(rem +" ");
            sum += rem ;
            n /= 10 ;
        }
        System.out.println(); 
        if (sum % 9 == 0)
        {
            System.out.println(temp + " is divisible by 9.");
        }
        else
        {
            System.out.println(temp + " is not divisible by 9.");
        }
    }
    public static void main (String [] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a number to check id a number is devisinle by 9 or not :");
        int n = s.nextInt();
        DivisibleByNine(n);
       s.close();
    }
}