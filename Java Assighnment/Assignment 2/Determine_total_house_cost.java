public class Determine_total_house_cost
{
    public static void main(String [] args)
    {
        int hc1 = 67000 ;
        int fule_cost1 = 2300 ;
        double tax1 = 0.025 ;
        total_cost_of_house(hc1, fule_cost1, tax1);
        
        int hc2 = 62000 ;
        int fule_cost2 = 2500 ;
        double tax2 = 0.025 ;
        total_cost_of_house(hc2, fule_cost2, tax2);

        int hc3 = 75000 ;
        int fule_cost3 = 1850 ;
        double tax3 = 0.020 ;
        total_cost_of_house(hc3, fule_cost3, tax3);


    }

    public static void total_cost_of_house(int hc , int fule_cost , double tax)
    {
        double annual_tax = hc * tax ;
        double total_house_cost = (hc + fule_cost) * 5 + annual_tax * 5 ;
        System.out.println("The total house cost after 5 years is "+total_house_cost);
    }

}
