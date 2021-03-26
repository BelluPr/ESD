/*26.Java program to check whether a number is a Duck Number or not*/
import java.io.*;
import java.util.*;
class DuckNumber 
{

    static boolean check_duck(String num)
    {
        
        int i = 0, n = num.length();
        while (i < n && num.charAt(i) == '0')
            i++;
  
        
        while (i < n) {
            if (num.charAt(i) == '0')
                return true;
            i++;
        }
  
        return false;
    }
  
    
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check as DuckNumber or not");
        String num = sc.nextLine();
        if (check_duck(num))
            System.out.println(num+" = It is a duck number");
        else
            System.out.println(num+" = It is not a duck number");
    }
}