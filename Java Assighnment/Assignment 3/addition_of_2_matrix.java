public class addition_of_2_matrix
{
    public static void main(String [] args)
    {
        int arr1 [] [] = {
            {1,2,3,4,5},
            {5,6,7,8,9},
            {1,5,9,7,5}
        };

        int arr2 [] []= {
            {7,8,9,4,5},
            {5,6,1,2,3},
            {9,5,1,7,5}             
        };

        int arr3 [] [] = new int[arr1.length][arr1[0].length] ;

        for(int i = 0 ; i < arr1.length ; i++)
        {
            for(int j = 0 ; j < arr1[0].length ; j++)
            {
                arr3 [i][j] = arr1 [i] [j] + arr2 [i] [j] ; 
            }
        }

        System.out.println("The result matrix is .");
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
