import java.util.Scanner;

public class fibonacci_series 
{
    public static void main(String[] args) 
    {
        int fibo = 0, fibo1 = 1, num, temp;
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number to get Fibonacci Series");
        num = sc.nextInt();

        System.out.println(fibo);
        System.out.println(fibo1);
        
        for(int i = 2; i<= num; i++)
        {
            
            temp = fibo + fibo1;
            System.out.println(temp);

            fibo = fibo1;
            fibo1 = temp;

        }
        
        sc.close();
    }    
}
