/*15. Implement a JAVA program to multiply two numbers using recursive multiplication.*/


import java.io.*;
import java.util.*;
  
class RecMul 
{
      
    // recursive function to calculate 
    // multiplication of two numbers
    static int product(int x, int y)
    {
        // if x is less than 
        // y swap the numbers
        if (x < y)
            return product(y, x);
      
        // iteratively calculate 
        // y times sum of x
        else if (y != 0)
            return (x + product(x, y - 1));
      
        // if any of the two numbers is 
        // zero return zero
        else
            return 0;
    }
      
    // Driver Code
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
       
        System.out.println("Product of "+x+" and "+y+" = "+product(x, y)); 
    }
}