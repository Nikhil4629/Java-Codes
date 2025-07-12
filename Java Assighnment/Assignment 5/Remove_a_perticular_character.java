import java.util.Scanner ;
public class Remove_a_perticular_character
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner (System.in) ;
        System.out.println("Enter the main String :");
        String mainstr = s.nextLine();
        System.out.println("Enter the character to be removed :");
        char ch  = s.next().charAt(0) ; 
        String newStr = "" ;
        for(int i = 0 ; i < mainstr.length();i++)
        {
            if(mainstr.charAt(i) != ch)
            {
                newStr += mainstr.substring(i , i+1) ;

            }
        }

        System.out.println("The new string after removing the character is : " + newStr) ;
        s.close();
    }
}
