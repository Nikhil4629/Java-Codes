import java.util.*;
// public class triple_number
// {
//     public static void main (String [] args)
//     {
//         Scanner S = new Scanner (System.in);
//         System.out.println("Enter the value of M :");
//         int m = S.nextInt();
//         System.out.println("Enter the value of N :");
//         int n = S.nextInt();
//         S.close();
//         if(m<n)
//         {
//             System.out.println("M should be greater than N");
          
//         }
//         int s1 = ((int) Math.pow(m,2)) - ((int) Math.pow(n,2));
//         int s2 = 2*m*n;
//         int h = ((int) Math.pow(m,2)) + ((int) Math.pow(n,2));
//         System.out.println("The triple numbers are :"+s1+" "+s2+" "+h);
//     } 
// }

abstract class Mathmatics
{
    //If we want to use one method to perform multiple operations then we can use abstract class
    abstract void calculate(int x);
}

class Demo1 extends Mathmatics
{
    void calculate(int x)
    {
        System.out.println("The square of the number is :"+(x*x));
    }
}
class Demo2 extends Mathmatics
{
    void calculate(int x)
    {
        System.out.println("The cube of the number is :"+(x*x*x));
    }
}
class Demo3 extends Mathmatics
{
    void calculate(int x)  //When a method is invoked by a clas, That method is static method
    {
        System.out.println("The square root of the number is :"+Math.sqrt(x));
    }
}
class AbstractDemo
{
    public static void main(String [] args)
    {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();
        d1.calculate(5);
        d2.calculate(5);
        d3.calculate(25);
    }
}