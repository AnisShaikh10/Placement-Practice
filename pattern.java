public class pattern
{
    public static void main(String[] args) 
    {
        System.out.println("Pattern Programs");
        
        // First Pattern:

        /* 
            *****
            *****
            *****
            ***** 
        */ 

        // int rows = 4,  patterns = 5;

        // for(int i = 1; i<=rows; i++)
        // {
        //     for(int j = 1; j<=patterns; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // Second Pattern:

        /* 
            *****
            *   *
            *   *
            ***** 
        */

        // int rows = 4,  patterns = 5;

        // for(int i = 1; i<=rows; i++)
        // {
        //     for(int j = 1; j<=patterns; j++)
        //     {
        //         if(i == 1 || j== 1|| i == rows || j == patterns)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println("");
        // }




        // Third Pattern:

        /* 
            *
            **
            ***
            **** 
        */

        // int rows = 4;

        // for(int i = 1; i <= rows; i++)
        // {
        //     for(int j = 1; j<=i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // Fourth Pattern:

        /* 
            ****
            ***
            **
            * 
        */

        // int rows = 4;

        // for(int i = 1; i <= rows; i++)
        // {
        //     for(int j = 4; j>=i; j--)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }



        // Fifth Pattern:

        /* 
              *
             **
            ***
           ****
        */

        // int rows = 4;

        // for(int i = 1; i<=rows; i++)
        // {
        //     for(int j = 1; j <= rows-i; j++)
        //     {
        //         System.out.print(" ");
        //     }

        //     for(int k = 1; k <= i; k++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println("");
        // }






        // Sixth Pattern:

        /* 
            1
            12
            123
            1234
            12345
        */

        // int rows = 5;

        // for(int i = 1; i<= rows; i++)
        // {
        //     for(int j = 1; j<= i; j++)
        //     {
        //         System.out.print(j + " ");
        //     }

        //     System.out.println("");
        // }




        // Seventh Pattern:

        /* 
            12345
            1234
            123
            12
            1
        */

        // int rows = 5;

        // for(int i= rows; i>=1; i--)
        // {
        //     for(int j= 1; j<=i; j++)
        //     {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        // Eight Pattern:

        /* 
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
        */

        // int rows = 5, number = 1;

        // for(int i= 1; i<=rows; i++)
        // {
        //     for(int j= 1; j<=i; j++)
        //     {
        //         System.out.print(number + " ");
        //         number++;     
        //     }
        //     System.out.println();
        // }



        // Ninth Pattern:

        /* 
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
        */

        // int rows = 5;

        // for(int i= 1; i<=rows; i++)
        // {
        //     for(int j= 1; j<=i; j++)
        //     {
                
        //         if((i + j) % 2 == 0)
        //         {
        //             System.out.print("1" + " ");
        //         }
        //         else
        //         {
        //             System.out.print("0" + " ");
        //         }
                
        //     }
        //     System.out.println();
        // }




        // Tenth Pattern:

        /* 
                *****
               *****
              *****
             *****
            ***** 
        */

        // int rows = 5;

        // for(int i= 1; i<=rows; i++)
        // {
        //     for(int j= 1; j<=rows-i; j++)
        //     {
        //         System.out.print(" ");
        //     }

        //     for(int k= 1; k <= rows; k++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        // Eleventh Pattern:

        /* 
             1 
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5

        */

        // int rows = 5;

        // for(int i= 1; i<=rows; i++)
        // {
        //     for(int j= 1; j<=rows-i; j++)
        //     {
        //         System.out.print(" ");
        //     }

        //     for(int k= 1; k <= i; k++)
        //     {
        //         System.out.print(i + " ");
                
        //     }

        //     System.out.println();
        // }


        // Twelveth Pattern:

        /* 
                    1
                  2 1 2
                3 2 1 2 3
              4 3 2 1 2 3 4
            5 4 3 2 1 2 3 4 5

        */

        // int rows = 5;

        // for(int i = 1; i<=rows; i++)
        // {
        //     // for spaces
        //     for(int j = 1; j<=rows-i; j++)
        //     {
        //         System.out.print(" ");
        //     }

            
        //     // first half
        //     for(int k= i; k >= 1; k--)
        //     {
        //         System.out.print(k + " ");
        //     }

        //     // Second half
        //     for(int l = 2; l<=i; l++)
        //     {
        //         System.out.print(l + " ");
        //     }

        //     System.out.println();
        // }


        // Thirteenth Pattern:

        /* 
            *      *
            **    **
            ***  ***
            ********
            ********
            ***  ***
            **    **
            *      *

        */

        // int rows = 4;

        // // Upper half
        // for(int i = 1; i<=rows; i++)
        // {
            
        //     // first pattern
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print("*");
        //     }
            
        //     // for spaces
        //     for(int j = 1; j<=2*(rows-i); j++)
        //     {
        //         System.out.print(" ");
        //     }

        //     // Second half
        //     for(int k= 1; k <=i; k++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // // Lower half
        // for(int i = rows; i >= 1; i--)
        // {
        //     // first pattern
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print("*");
        //     }

        //     // for spaces
        //     for(int k = 1; k <= 2* (rows-i); k++)
        //     {
        //         System.out.print(" ");
        //     }

        //     // second pattern
        //     for(int l=1; l<=i; l++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        // Fourteenth Pattern:

        /* 
            *
           ***
          *****
         *******
         *******
          *****
           ***
            *
        */

        int rows=4;

        // upper half
        for(int i = 1; i<= rows; i++)
        {
            // for Spaces
            for(int j = 1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }

            // for pattern
            for(int k = 1; k<=(2*i)-1; k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half
        for(int i = rows; i>=1; i--)
        {
            // for Spaces
            for(int j = 1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }

            // for pattern
            for(int k = 1; k<=(2*i)-1; k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }



    }
}