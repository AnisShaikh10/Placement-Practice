import java.util.Scanner;

public class two_d_array 
{
    public static void main(String[] args) 
    {
        
        // Find number in 2d array

        Scanner sc  = new Scanner(System.in);

        int rows, cols;

        System.out.println("Enter the numbers of rows of an Array");
        rows = sc.nextInt();

        System.out.println("Enter the numbers of columns of an Array");
        cols = sc.nextInt();

        int matrixs[][] = new int[rows][cols];

        for(int i= 0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.println("Enter element for " + i + " " +j);
                matrixs[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number to find in an Array");
        int find_no = sc.nextInt();

        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<cols; j++)
            {
                if(matrixs[i][j] == find_no)
                {
                    System.out.println("Found at location " + i + "," + j);
                    return;
                }
                else
                {
                    continue;
                }
            }
        }

        System.out.println("Element not found");

        sc.close();
        return;

    }    
}
