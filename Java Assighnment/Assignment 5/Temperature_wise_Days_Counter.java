public class Temperature_wise_Days_Counter
{
    public static void main (String [] args)
    {
        int days [] = {55,62,68,74,59,46,41,58,60,67,65,78,82,85,91,92,90,93,87,80,78,79,72,68,62,59} ;
        int hot_days = 0 ,pleasant_days = 0 ,cold_days = 0 ;

        for(int i : days)
        {
            if(i >= 85)
            {
                hot_days ++ ;
            }
            else if (i >= 60 && i < 85)
            {
                pleasant_days ++ ;
            }
            else if (i < 60)
            {
                cold_days ++ ;
            }
        }

        System.out.println("The number of hot days is : "+hot_days);
        System.out.println("The number of plesant days is : "+pleasant_days);
        System.out.println("The number of cold days is : "+cold_days);
    }   
}
