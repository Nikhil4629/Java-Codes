import java.util.Scanner ;
public class Compare2Strings
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner (System.in) ;
        System.out.println("Enter first string :");
        String s1 = s.nextLine() ;
        System.out.println("Enter the second String :");
        String s2 = s.nextLine() ;

        int s3 = s1.compareTo(s2) ;
        int s4 = s1.compareToIgnoreCase(s2) ;

       if(s3 == 0)
       {
          System.out.println("The strings are equal.") ;
       }
       else if (s3 > 0)
       {
          System.out.println("The first string is greater then the second string.");
       }
       else
       {
           System.out.println("The first string is less then the second string.");
       }

       if(s4 == 0)
       {
          System.out.println("After ignoring the case the strings are equal.") ;
       }
       else if (s4 > 0)
       {
          System.out.println("After ignoring the case the first string is greater then the second string.");
       }
       else
       {
           System.out.println("After ignoring the case the first string is less then the second string.");
       }


        s.close() ;
    }
}
