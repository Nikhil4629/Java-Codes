public class Fibonacci
{
    public static void main(String [] args)
    {
        java.util.Scanner S = new java.util.Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = S.nextInt();
        int a = 0 ;
        int b = 1 ;
        S.close();
        for(int i = 0 ; i <= n ; i++)
        {
            int temp = a+b ; 
            System.out.print(a + " ");
            a = b ;
            b = temp ;
        } 
        System.out.println();
        System.out.println("The "+n+" term of fibonacc sequence is :");
        for(int i = 0 ; i <= n ; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }   
    public static int fibonacci(int n)
    {
        if (n == 0)
        {
            return 0 ;
        }
        if(n == 1)
        {
            return 1 ;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
