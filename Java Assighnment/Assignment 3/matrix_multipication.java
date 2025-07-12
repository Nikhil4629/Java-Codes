public class matrix_multipication
{
    public static void main(String [] args)
    {
        int arr1 [] [] = {
            {1,2,3},
            {5,6,7},
            {1,5,9}
        };

        int arr2 [] []= {
            {7,8,9},
            {5,6,1},
            {9,5,1}             
        };

        if(arr1[0].length != arr2.length)
        {
            System.out.println("Matrix multipication is not possible.");
            return ;
        }

        int arr3 [] [] = new int[arr1.length][arr2[0].length];

        for(int i = 0 ; i < arr1.length ; i++)
        {
            for(int j = 0 ; j < arr2[0].length ; j++)
            {
                for(int k = 0 ; k < arr1[0].length ; k++)
                {
                    arr3 [i] [j] += arr1 [i] [k] * arr2 [k] [j] ;
                }
            }
        }

        System.out.println("The result matrix is :");
        for(int i = 0 ; i < arr3.length ; i++)
        {
            for(int j = 0 ; j < arr3[i].length ; j++)
            {
                System.out.print(arr3 [i] [j] + " ");
            }
            System.out.println();
        }
    }   

}
