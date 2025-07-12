public class Factorial
{
  public static void main(String [] args)
  {
     java.util.Scanner S = new java.util.Scanner(System.in);
     System.out.println("Enter the number you want the factorial of :");
     int n = S.nextInt();
     long fact = factorial(n);
     System.out.println("The factorial of "+n+ " is "+fact);
     S.close();

  }   

    public static long factorial(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
}
