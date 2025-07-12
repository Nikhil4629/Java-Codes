import java.util.Scanner ;
public class SearchWordinString
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the main String :");
        String mainstr = sc.nextLine() ;
        System.out.println("Enter the substring you are searching for :");
        String substr = sc.nextLine() ;
        int index = mainstr.indexOf(substr);

        if(index != -1)
        {
            System.out.println("the substring is found on the index : "+index);
        }
        else
        {
            System.out.println("the substring is not found on the String.");
        }
        sc.close();
    }
}
