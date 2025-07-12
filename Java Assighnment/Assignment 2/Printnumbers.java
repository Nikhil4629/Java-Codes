import java.util.Scanner;
public class Printnumbers
{
    public static void main(String [] args)
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter the Starting point :");
        int st = S.nextInt();
        System.out.println("Enter the ending point :");
        int end = S.nextInt();
        int temp = st;
        S.close();
        while(st <= end)
        {
            System.out.print(st + " ");
            st++;
        }
        System.out.println();


        display(temp,end);
    }

    public static void display (int x , int y)
    {
        if (x > y)
        {
            return ;
        }
        else
        {
            System.out.print(x + " ");
            x++;
        }
        display(x,y);
    }
}