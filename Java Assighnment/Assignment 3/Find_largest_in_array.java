public class Find_largest_in_array
{
    public static void main(String [] args)
    {
        int arr [] = {15,10,12,3,5,7};
        int gratest = largest_element(arr);

        System.out.println("The largest element in the array is "+gratest);
    }

    public static int largest_element(int arr [])
    {
        int largest = arr[0];
        for (int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i] ;
            }
        }
        return largest ;
    }
}