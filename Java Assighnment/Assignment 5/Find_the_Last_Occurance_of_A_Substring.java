import java.util.Scanner ;
public class Find_the_Last_Occurance_of_A_Substring
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner (System.in) ;
        System.out.println("Enter the main String :");
        String mainstr = s.nextLine();
        System.out.println("Enter the substring :");
        String substring = s.nextLine();
        int lastoccurance = mainstr.lastIndexOf(substring) ;
        
        if(lastoccurance == -1)
        {
            System.out.println("There is no substring is available in the main string.");
        }
        else
        {
            System.out.println("The last occurance of the substring is at index : " + lastoccurance);
        }

        s.close() ;
    }
}
