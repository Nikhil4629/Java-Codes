
public class Reverse_a_number
{
    public static void main (String [] args)
    {
        java.util.Scanner S = new java.util.Scanner(System.in); 

        System.out.println("Enter the number :");
        int n = S.nextInt();
        int n1 = n ;
        int rev = 0 ;
        int rev1 = 0 ;
        int rev2 = reverse(n1, rev1);
        S.close();

        while(n != 0)
        {
            rev = rev *10 + n % 10 ;
            n /= 10 ;
        }
        System.out.println("The reversed number is "+rev);
        System.out.println("The reversed number is "+rev2);

    }   

    public static int reverse (int n , int r)
    {
        if(n==0)
        {
            return r;
        }

        else
        {
            return reverse(n/10,r * 10 + n % 10);
        }
    }
}
