/*24.Java program to check whether a number is a Pronic Number or Heteromecic Number or not.*/


import java.util.Scanner;
class Pronic
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int flag=0;
        for(int i=1; i<n ; i++)
        {
            if(i*(i+1)==n)
            {
                flag=1;
                break;
            }
        }
        
        if(flag==1)
            System.out.println(n + " is a pronic number");
        else
            System.out.println(n + " is not a pronic number");
    }
}