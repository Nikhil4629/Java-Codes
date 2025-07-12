import java.util.Scanner;

public class RecursiveBinarySearch
{
    public static int BinarySearch(int arr [] , int key , int start , int end)
    {
        if (start > end)
        {
            return -1 ;
        }

        int mid = start + (end - start) /2 ;

        if(arr [mid] == key)
        {
            return mid ;
        }
        else if (key > arr [mid])
        {
            return BinarySearch(arr, key, mid + 1,  end);
        }
        else
        {
            return BinarySearch(arr, key, start, mid -1);
        }
    }
    public static void main(String [] args)
    {
        Scanner s = new Scanner (System.in);
        int arr [] = {15,34,91,25,97,45};
        System.out.println("Enter the searching element :");
        int key = s.nextInt();
        int bs = BinarySearch(arr,key,0,arr.length-1);

        if(bs == -1)
        {
            System.out.println(key+" is not found in the array.");
        }
        else
        {
            System.out.println(key +" is found in the "+ bs +"th index.");
        }
        s.close();
    }
}