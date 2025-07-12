public class Find_second_largest_in_array
{
    public static void main (String [] args)
    {
        int arr [] = {15,10,12,3,5,7};
        int second_largest = second_largest(arr);
       
        System.out.println("The second largest element in the array is "+second_largest);
        
    }  
    
    public static int second_largest(int arr [])
    {
        int largest = 0 , s_largest = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > largest )
            {
                largest = arr[i] ;
            }
            if(arr [i] > s_largest && arr[i] != largest)
            {
                s_largest = arr[i];
            }

        }
        System.out.println("The largest element is "+largest);
        return s_largest ;
    }
}
