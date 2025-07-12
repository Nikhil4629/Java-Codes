import java.util.Scanner ;
public class BMI_calculator_And_Catagorize
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner (System.in) ;
        System.out.println("Enter the weight is pounds :");
        double weight = s.nextDouble() ;
        System.out.println("Enter the hight in inches :");
        double hight = s.nextDouble () ;
        double BMI =(703 *weight) /(hight * hight) ;
        System.out.println("The BMI is : " + BMI) ;
        if(BMI < 18.5)
        {
            System.out.println("Under weight.") ;
        }
        else if (BMI >= 18.5 && BMI < 24.9)
        {
            System.out.println("Normal weight.");
        }

        else if(BMI >= 25.0 && BMI <=29.9)
        {
           System.out.println("Over weight."); 
        }

        else
        {
            System.out.println("Obesity.") ;
        }
        s.close() ;
    }
}
