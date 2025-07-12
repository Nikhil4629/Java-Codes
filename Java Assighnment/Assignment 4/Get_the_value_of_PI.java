
public class Get_the_value_of_PI
{
    public static void main (String [] args)
    {
        double pi = 0 ;
        int j = 1 ;
        for(int i = 1 ; j < 94 ; i++,j += 2 )
        {
            pi += Math.pow(-1 , i - 1 ) / (2 * i - 1) ;
        }
        pi *= 4 ;
        System.out.println("The value of pi is "+pi);
        
    }   
}
