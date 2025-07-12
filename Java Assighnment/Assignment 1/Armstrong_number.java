import java.util.*;
public class Armstrong_number
{
    public static void main (String [] args)
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter the number to check whether it is Armstrong or not :");
        int n = S.nextInt();
        S.close();
        int temp = n;
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            sum = sum + ((int)Math.pow(rem,3));
            n = n/10;
        }
        if(temp==sum)
        {
            System.out.println(temp+" is Armstrong number");
        }
        else
        {
            System.out.println(temp+" is not Armstrong number");
        }
    }
}
