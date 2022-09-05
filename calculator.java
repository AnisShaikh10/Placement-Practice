import java.util.Scanner;

public class calculator
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();

        System.out.println("Enter operation to perform e.g + - * / %");
        char operator = sc.next().charAt(0);

        int sum;


        switch(operator)
        {
            case '+': 
                sum = a + b; 
                System.out.println("The Sum of two numbers is: " + sum );
            break;
            
            case '-': 
                sum = b - a; 
                System.out.println("The Difference of two numbers is: " + sum );
            break;

            case '*':
                sum = a * b; 
                System.out.println("The Multiplication of two numbers is: " + sum );
            break;

            case '/':
                sum = a / b; 
                System.out.println("The Division of two numbers is: " + sum );
            break;

            case '%':
                sum = a % b; 
                System.out.println("The Remainder of two numbers is: " + sum );
            break;

            default: System.out.println("Invalid Input");
        }

        sc.close();


    }
}