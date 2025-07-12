import java.util.Scanner ;
public class SplitAString
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter a string to split it :");
        String str = sc .nextLine() ;
        String substrings [] = str.split(" ") ;
        System.out.println("The substrings are :");
        for(String i : substrings)
        {
            System.out.println(i + " ");
        }
       
        sc.close();
    }
}
