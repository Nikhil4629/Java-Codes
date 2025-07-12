import java.util.Scanner;
public class Grass_cutting
{
    public static void main (String [] args)
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter the length of the rectangular yard in feet:");
        double l = S.nextDouble();
        System.out.println("Enter the breadth of the rectangular yard in feet:");
        double b = S.nextDouble();

        System.out.println("Enter the length of the rectangular house in the yard in feet :");
        double l1 = S.nextDouble();
        System.out.println("Enter the breadth of the rectangular house in the yard in feet :");
        double b1 = S.nextDouble();
        S.close();
        int price_per_sqfeet = 2;
        double area_of_yard = l * b ;
        double area_of_house = l1 * b1;
        double area_of_grass = area_of_yard - area_of_house;
        double expense = area_of_grass * price_per_sqfeet;
        System.out.println("The price of cutting the grass is :"+expense);

    }
}
