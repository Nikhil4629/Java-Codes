import java.util.Scanner ;
public class ReverseString
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter the main string :");
        String mainstr = sc . nextLine() ;
        String revstr = new StringBuilder(mainstr).reverse().toString() ;
        System.out.println("The reverse of the string is : " + revstr) ;
        sc.close();
    }
}