import java.util.Scanner;

public class greatest_common_divisor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        int num1, num2, gcd=0;

        System.out.println("Enter First Number");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number");
        num2 = sc.nextInt();

        for(int i = 1; i<= num1; i++)
        {
            if(num1%i == 0 && num2%i == 0)
            {
                gcd = i;
            }
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

    }
}