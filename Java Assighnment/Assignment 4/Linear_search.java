import java.util.Scanner ;
public class Linear_search
{
    public static int LinearSearch(int arr [] ,int  key)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr [i] == key)
            {
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String [] args)
    {
        Scanner s = new Scanner (System.in);
        int arr [] = {15,34,91,25,97,45};
        System.out.println("Enter the searching element :");
        int key = s.nextInt();
        int ls = LinearSearch(arr,key);
        if(ls == -1)
        {
            System.out.println(key+" is not found in the array.");
        }
        else
        {
            System.out.println(key +" is found in the "+ ls +"th index.");
        }
        s.close();
    }
}