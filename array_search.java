import java.util.Scanner;

public class array_search 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arrray_size, find_no;

        System.out.println("Enter the size of an Array");
        arrray_size = sc.nextInt();

        int numbers_list[] = new int[arrray_size];

        // input array 
        for(int i = 0; i<arrray_size; i++)
        {
            System.out.println("Enter element " + i);
            numbers_list[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find in an Array");
        find_no = sc.nextInt();

        // searching element in array
        for(int j = 0; j<arrray_size; j++)
        {
            if(find_no == numbers_list[j])
            { 
                System.out.println(find_no + " Found at location " + j);
                return;
            }
            else
            {
                continue;
                
            }
            
        }

        System.out.println("Sorry number " + find_no +  " not found in an array");
        
    }    
}
