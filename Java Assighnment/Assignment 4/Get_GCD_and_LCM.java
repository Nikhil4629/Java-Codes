import java.util.Scanner ;
public class Get_GCD_and_LCM
{
    public static int gcd(int a , int b)
    {
        if ( b == 0)
        {
            return a ;
        }
        return gcd(b, a % b) ;
    }

    public static int lcm(int a , int b)
    {
        return a * b / gcd(a, b) ;
    }
    public static void main (String [] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the value of a :");
        int a = s.nextInt();
        System.out.println("Enter the value of  b :");
        int b = s.nextInt();

        System.out.println("The GCD of " + a + " and " + b +" is "+gcd(a, b));
        System.out.println("The LCF of " + a + " and " + b +" is "+lcm(a, b));
        s.close();
    }
}
