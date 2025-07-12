import java.util.Scanner;
public class Prime_number 
    {
    public static void main(String [] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is prime or not :");
        int n = S.nextInt();
        S.close();
        int count =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(n+" is prime");
        }
        else
        {
            System.out.println(n+" is not prime");
        }
    }

}
