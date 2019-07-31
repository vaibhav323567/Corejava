/*
Vaibhav Sharma
==================================

*/


public class pattern7
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
       // Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        //System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = 5;
        //scanner.nextInt();
        
        for (int i=1; i<=rows; i++) 
        { 
            // Print space in decreasing order 
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++) 
            { 
               System.out.print(i); 
            } 
            System.out.println(); 
        } 
        for (int i=rows-1; i>=1; i--)
        {
         // Print space in increasing order
            for (int j=rows-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            // Print star in decreasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print(i);
            }
            
            System.out.println();
        }
        //scanner.close();
    }
}